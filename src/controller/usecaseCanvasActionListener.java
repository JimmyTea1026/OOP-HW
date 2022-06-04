package controller;

import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.event.MouseInputListener;
import utility.nodeType;
import model.Shape;
import model.node;
import model.usecaseObject;

public class usecaseCanvasActionListener implements MouseInputListener{
    private ArrayList <Shape> shapeList;
    private JPanel canvas;
    int X, Y;

    public usecaseCanvasActionListener(JPanel c, ArrayList <Shape> s){
        canvas = c;
        shapeList = s;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        X = e.getX();
        Y = e.getY();
        // TODO Auto-generated method stub
        node newNode = new node(nodeType.type.LEAF);
        usecaseObject newUsecaseObj = new usecaseObject(e.getX(), e.getY(), newNode);
        newNode.setContent(newUsecaseObj);
        shapeList.add(newUsecaseObj);
        int dep = shapeList.indexOf(newUsecaseObj);
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
