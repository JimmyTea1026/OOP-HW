package controller;

import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.event.MouseInputListener;
import model.basicObject;
import model.node;

public class selectCanvasActionListener implements MouseInputListener{
    private ArrayList <basicObject> objList;
    private ArrayList <node> selectedList;
    private JPanel canvas;
    int X1, Y1, X2, Y2;

    public selectCanvasActionListener(JPanel c, ArrayList <basicObject> b, ArrayList <node> sel){
        canvas = c;
        objList = b;
        selectedList = sel;
    }

    private void selectOne(){
        selectedList.clear();
        for(int i = 0; i < objList.size(); i++){
            basicObject obj = objList.get(i);
            obj.beSelected(false);
        }
        // 最新的obj在list最後面，若滑鼠位置有兩個以上的obj，會選到最後新增，也就是最上面的obj
        for(int i = objList.size()-1; i >= 0; i--){
            basicObject obj = objList.get(i);  
            if(obj.getx1() <= X1 && X1 <= obj.getx2() &&
                obj.gety1() <= Y1 && Y1 <= obj.gety2()){
                node root;
                ArrayList<basicObject> allObj;
                root = obj.getNodePointer().getRoot();
                allObj = root.getAllObj();
                for(int j = 0; j < allObj.size(); j++){
                    allObj.get(j).beSelected(true);
                }
                selectedList.add(root);
                break;
            }
        }
        canvas.repaint();
    }

    private void selectMany(){
        if(X1 > X2){
            int temp = X1;
            X1 = X2;
            X2 = temp;
        }
        if(Y1 > Y2){
            int temp = Y1;
            Y1 = Y2;
            Y2 = temp;
        }

        selectedList.clear();
        for(int i = 0; i < objList.size(); i++){
            basicObject obj = objList.get(i);
            obj.beSelected(false);
        }

        for(int i = 0; i < objList.size(); i++){
            basicObject obj = objList.get(i);
            if(X2 >= obj.getx2() && obj.getx1() >= X1 &&
               Y1 <= obj.gety1() && obj.gety2() <= Y2){
                    node root;
                    ArrayList<basicObject> allObj;
                    root = obj.getNodePointer().getRoot();
                    allObj = root.getAllObj();
                    for(int j = 0; j < allObj.size(); j++){
                        allObj.get(j).beSelected(true);
                    }

                    if(!selectedList.contains(root)){
                        selectedList.add(root);
                    }
                }
        }
        canvas.repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        X1 = e.getX();
        Y1 = e.getY();
        selectOne();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        X1 = e.getX();
        Y1 = e.getY();
        selectOne();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        X2 = e.getX();
        Y2 = e.getY();
        if(selectedList.size() != 0){
            int xMove = X2-X1;
            int yMove = Y2-Y1;
            for(int i = 0; i < selectedList.size(); i++){
                ArrayList<basicObject> allObj = selectedList.get(i).getAllObj();
                for(int j = 0; j < allObj.size(); j++){
                    allObj.get(j).resetXY(xMove, yMove);
                }
            } 
            canvas.repaint();
        }
        else{
            selectMany();
        }
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

}
