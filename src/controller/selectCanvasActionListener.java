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
    int X, Y;

    public selectCanvasActionListener(JPanel c, ArrayList <basicObject> b, ArrayList <node> sel){
        canvas = c;
        objList = b;
        selectedList = sel;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        X = e.getX();
        Y = e.getY();
        // TODO Auto-generated method stub
        selectedList.clear();
        for(int i = 0; i < objList.size(); i++){
            basicObject obj = objList.get(i);
            obj.beSelected(false);
        }
        // 最新的obj在list最後面，若滑鼠位置有兩個以上的obj，會選到最後新增，也就是最上面的obj
        for(int i = objList.size()-1; i >= 0; i--){
            basicObject obj = objList.get(i);  
            if(obj.getx1() <= X && X <= obj.getx2() &&
                obj.gety1() <= Y && Y <= obj.gety2()){
                node root;
                ArrayList<basicObject> allObj;
                root = obj.getNodePointer().getRoot();
                allObj = root.traverse();
                selectedList.add(root);
                for(int j = 0; j < allObj.size(); j++){
                    allObj.get(j).beSelected(true);
                }
                break;
            }
        }
        System.out.println(selectedList);
        canvas.repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        
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
