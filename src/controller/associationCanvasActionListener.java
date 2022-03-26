package controller;

import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.event.MouseInputListener;
import model.Line;
import model.associationLine;
import model.basicObject;

public class associationCanvasActionListener implements MouseInputListener{
    private JPanel canvas;
    private ArrayList<Line> lineList;
    private ArrayList<basicObject> objList;
    private int X1, Y1, X2, Y2;

    public associationCanvasActionListener(JPanel c, ArrayList<Line> l, ArrayList <basicObject> b) {
        canvas = c;
        lineList = l;
        objList = b;
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
        boolean getObj1 = false, getObj2 = false;
        Line newLine = new associationLine();
        for(int i = objList.size()-1; i >= 0; i--){
            basicObject obj = objList.get(i);  
            if(obj.getx1() <= X1 && X1 <= obj.getx2() &&
                obj.gety1() <= Y1 && Y1 <= obj.gety2()){
                    newLine.setObj1(obj);   
                    getObj1 = true;
                    break;
            }
        }
        for(int i = objList.size()-1; i >= 0; i--){
            basicObject obj = objList.get(i);  
            if(obj.getx1() <= X2 && X2 <= obj.getx2() &&
                obj.gety1() <= Y2 && Y2 <= obj.gety2()){
                    newLine.setObj2(obj); 
                    getObj2 = true;
                    break;
            }
        }
        if(getObj1 && getObj2){
            lineList.add(newLine);
        }
        canvas.repaint();

    }
    @Override
    public void mouseClicked(MouseEvent e) {
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
