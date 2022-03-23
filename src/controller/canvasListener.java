package controller;

import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.event.MouseInputListener;

import model.Line;
import model.Shape;
import model.basicObject;
import model.classObject;
import model.usecaseObject;

import java.awt.*;
import utility.curState;

public class canvasListener implements MouseInputListener{
    private curState appState;
    private JPanel canvas;
    public ArrayList <Shape> ShapeList;
    public ArrayList <basicObject> objList;
    public ArrayList <basicObject> selectedList;
    public ArrayList <Line> lineList;
    private int X, Y;
    public canvasListener(curState state, JPanel c, ArrayList shape, ArrayList obj, ArrayList line, ArrayList select){
        appState = state;
        canvas = c;
        ShapeList = shape;
        objList = obj;
        lineList = line;
        selectedList = select;
    }

    public ArrayList getSelectedList(){
        return selectedList;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        X = e.getX();
        Y = e.getY();
        switch(appState.currentState){
            case SELECT:
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
                        obj.beSelected(true);
                        selectedList.add(obj);
                        canvas.repaint();
                        break;
                    }
                }
                System.out.println(selectedList);
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
                classObject newClassObj = new classObject(e.getX(), e.getY());
                ShapeList.add(newClassObj);
                objList.add(newClassObj);
                int dep = ShapeList.indexOf(newClassObj);
                newClassObj.setDepth(dep);
                canvas.repaint();
                
                break;

            case USECASS:
                usecaseObject newUsecaseObj = new usecaseObject(e.getX(), e.getY());
                ShapeList.add(newUsecaseObj);
                objList.add(newUsecaseObj);
                dep = ShapeList.indexOf(newUsecaseObj);
                newUsecaseObj.setDepth(dep);
                canvas.repaint();

                break;

            case GROUP:
                System.out.println(appState.currentState);
                break;

            case UNGROUP:
                System.out.println(appState.currentState);
                break;

            case RENAME:
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
