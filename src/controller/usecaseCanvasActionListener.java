package controller;

import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.event.MouseInputListener;
import utility.nodeType;
import model.basicObject;
import model.node;
import model.usecaseObject;

public class usecaseCanvasActionListener implements MouseInputListener{
    private ArrayList <basicObject> objList;
    private JPanel canvas;
    int X, Y;

    public usecaseCanvasActionListener(JPanel c, ArrayList <basicObject> b){
        canvas = c;
        objList = b;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        X = e.getX();
        Y = e.getY();
        // TODO Auto-generated method stub
        usecaseObject newUsecaseObj = new usecaseObject(e.getX(), e.getY());
        node newNode = new node(nodeType.type.LEAF);
        newNode.setContent(newUsecaseObj);
        newUsecaseObj.setNodePointer(newNode);
        objList.add(newUsecaseObj);
        int dep = objList.indexOf(newUsecaseObj);
        newUsecaseObj.setDepth(dep);

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
