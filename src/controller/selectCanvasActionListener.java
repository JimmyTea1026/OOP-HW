package controller;

import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.event.MouseInputListener;
import model.Line;
import model.Shape;
import model.basicObject;

public class selectCanvasActionListener implements MouseInputListener{
    private ArrayList <Shape> ShapeList;
    private ArrayList <basicObject> objList;
    private ArrayList <Line> lineList;
    private ArrayList <basicObject> selectedList;
    private JPanel canvas;
    int X, Y;

    public selectCanvasActionListener(JPanel c, ArrayList <Shape> s, ArrayList <basicObject> b, ArrayList <Line> l, ArrayList <basicObject> sel){
        canvas = c;
        ShapeList = s;
        objList = b;
        lineList = l;
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
                ArrayList<basicObject> a = obj.getNodePointer().traverse();
                for(int j = 0; j < a.size(); j++){
                    a.get(j).beSelected(true);
                    selectedList.add(a.get(j));
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
