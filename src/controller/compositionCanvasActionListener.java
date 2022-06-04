package controller;

import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.event.MouseInputListener;
import model.Shape;
import model.compositionLine;

public class compositionCanvasActionListener implements MouseInputListener{
    private JPanel canvas;
    private ArrayList<Shape> shapeList;
    private int X1, Y1, X2, Y2;

    public compositionCanvasActionListener(JPanel c, ArrayList<Shape> s) {
        canvas = c;
        shapeList = s;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        X1 = e.getX();
        Y1 = e.getY();   
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        X2 = e.getX();
        Y2 = e.getY();
        Shape s1 = null, s2 = null;
        boolean gets1 = false, gets2 = false;
        for(int i = shapeList.size()-1; i >= 0; i--){
            Shape s = shapeList.get(i);  
            if(s.isInside(X1, Y1) && !gets1){ 
                gets1 = true;
                s1 = s;
            }
            else if(s.isInside(X2, Y2) && !gets2){ 
                gets2 = true;
                s2 = s;
            }
        }
        if(gets1 && gets2){
            Shape newLine = new compositionLine(s1, s2);
            newLine.setDepth(-1);
            shapeList.add(newLine);
        }
        canvas.repaint();

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
