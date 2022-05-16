package controller;

import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.JPanel;

import model.basicObject;
import model.node;

public class selectActionListener extends ToolbarBtnActionListener{
    private selectCanvasActionListener AL;

    public selectActionListener(JPanel c, ArrayList <basicObject> b, ArrayList <node> sel){
        super(c);
        AL = new selectCanvasActionListener(canvas, b, sel);
    }
    
    public void actionPerformed(ActionEvent e){
        canvas.removeMouseListener(canvas.getMouseListeners()[0]);
        canvas.addMouseListener(AL);
    }     
}