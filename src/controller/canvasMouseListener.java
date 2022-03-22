package controller;

import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.event.MouseInputListener;

import model.Line;
import model.Shape;
import model.basicObject;
import model.classObject;
import java.awt.*;
import utility.curState;

public class canvasMouseListener implements MouseInputListener{
    private curState appState;
    private JPanel canvas;
    ArrayList <Shape> ShapeList;
    public ArrayList <basicObject> objList;
    public ArrayList <Line> lineList;
    private int X, Y;
    public canvasMouseListener(curState s, JPanel c, ArrayList a, ArrayList o, ArrayList l){
        appState = s;
        canvas = c;
        ShapeList = a;
        objList = o;
        lineList = l;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        X = e.getX();
        Y = e.getY();
        switch(appState.currentState){
            case SELECT:
                for(int i = 0; i < objList.size(); i++){
                    basicObject obj = objList.get(i);
                    obj.beSelected(false);
                    if(obj.getx1() <= X && X <= obj.getx2() &&
                        obj.gety1() <= Y && Y <= obj.gety2()){
                        System.out.println("selected");
                        obj.beSelected(true);
                        canvas.repaint();
                    }
                }
                
                break;

            case GENERATION:
                System.out.println(appState.currentState);
                break;
                
            case ASSCIATION:
                System.out.println(appState.currentState);
                break;

            case COMPOSITION:
                System.out.println(appState.currentState);
                break;

            case CLASS:
                classObject newObj = new classObject(e.getX(), e.getY());
                ShapeList.add(newObj);
                objList.add(newObj);
                canvas.repaint();
                break;

            case USECASS:
                System.out.println(appState.currentState);
                break;

            case GROUP:
                System.out.println(appState.currentState);
                break;

            case UNGROUP:
                System.out.println(appState.currentState);
                break;

            default:
                break;

        }
        
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
