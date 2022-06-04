package controller;

import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.event.MouseInputListener;
import model.Shape;
import model.basicObject;
import model.node;

public class selectCanvasActionListener implements MouseInputListener{
    private ArrayList <Shape> shapeList;
    private JPanel canvas;
    int X1, Y1, X2, Y2;

    public selectCanvasActionListener(JPanel c, ArrayList <Shape> s){
        canvas = c;
        shapeList = s;
    }

    private void selectOne(){
        for(int i = 0; i < shapeList.size(); i++){
            shapeList.get(i).isSelected(false);
        }

        // 最新的obj在list最後面，若滑鼠位置有兩個以上+的obj，會選到最後新增，也就是最上面的obj
        for(int i = shapeList.size()-1; i >= 0; i--){
            Shape s = shapeList.get(i);  
            if(s.isInside(X1, Y1)){
                node root;
                ArrayList<basicObject> allObj;
                root = s.getNodePointer().getRoot();
                allObj = root.getAllObj();
                for(int j = 0; j < allObj.size(); j++){
                    allObj.get(j).isSelected(true);
                }
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

        for(int i = 0; i < shapeList.size(); i++){
            shapeList.get(i).isSelected(false);
        }

        for(int i = 0; i < shapeList.size(); i++){
            Shape s = shapeList.get(i);
            if(X2 >= s.getx2() && s.getx1() >= X1 &&
               Y1 <= s.gety1() && s.gety2() <= Y2){
                    node root;
                    ArrayList<basicObject> allObj;
                    root = s.getNodePointer().getRoot();
                    allObj = root.getAllObj();
                    for(int j = 0; j < allObj.size(); j++){
                        allObj.get(j).isSelected(true);
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
        ArrayList<Shape> selectedList = new ArrayList<Shape>();
        for(int i = 0; i < shapeList.size(); i++){
            Shape s = shapeList.get(i);
            if(s.selectedStatus()){
                selectedList.add(s);
            }
        }
        if(selectedList.size() != 0){   //move
            int xMove = X2-X1;
            int yMove = Y2-Y1;
            for(int i = 0; i < selectedList.size(); i++){
                ArrayList<basicObject> allObj = selectedList.get(i).getNodePointer().getAllObj();
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
