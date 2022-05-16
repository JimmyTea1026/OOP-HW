package controller;

import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.event.MouseInputListener;
import model.Line;
import model.basicObject;
import model.node;

public class ToolbarBtnActionListener implements ActionListener{
    protected JPanel canvas;
    protected ArrayList <basicObject> objList;
    protected ArrayList <Line> lineList;
    protected ArrayList <node> selectedList;
    protected MouseInputListener AL;

    public ToolbarBtnActionListener(JPanel c){
        canvas = c;
    }
    
    public void actionPerformed(ActionEvent e){
        canvas.removeMouseListener(canvas.getMouseListeners()[0]);
        canvas.addMouseListener(AL);
    }  
}