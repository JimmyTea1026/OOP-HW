package controller;

import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.JPanel;

import model.basicObject;
import model.node;

public class selectActionListener implements ActionListener{
    private JPanel canvas;
    private selectCanvasActionListener AL;

    public selectActionListener(JPanel c, ArrayList <basicObject> b, ArrayList <node> sel){
        canvas = c;
        AL = new selectCanvasActionListener(c, b, sel);
    }
    
    public void actionPerformed(ActionEvent e){
        canvas.removeMouseListener(canvas.getMouseListeners()[0]);
        canvas.addMouseListener(AL);
    }     
}