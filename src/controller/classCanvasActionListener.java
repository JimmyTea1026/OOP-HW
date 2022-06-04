package controller;

import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.event.MouseInputListener;
import utility.nodeType;
import model.basicObject;
import model.classObject;
import model.node;

public class classCanvasActionListener implements MouseInputListener{
    private ArrayList <basicObject> objList;
    private JPanel canvas;
    int X, Y;

    public classCanvasActionListener(JPanel c, ArrayList <basicObject> b){
        canvas = c;
        objList = b;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        X = e.getX();
        Y = e.getY();
        // TODO Auto-generated method stub
        node newNode = new node(nodeType.type.LEAF);
        classObject newClassObj = new classObject(e.getX(), e.getY(), newNode);
        newNode.setContent(newClassObj);
        objList.add(newClassObj);
        int dep = objList.indexOf(newClassObj);
        newClassObj.setDepth(dep);
        
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
