package controller;

import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.JPanel;
import model.basicObject;

public class classActionListener extends ToolbarBtnActionListener{
    private classCanvasActionListener AL;

    public classActionListener(JPanel c, ArrayList <basicObject> b){
        super(c);
        AL = new classCanvasActionListener(canvas, b);
    }
    
    public void actionPerformed(ActionEvent e){
        canvas.removeMouseListener(canvas.getMouseListeners()[0]);
        canvas.addMouseListener(AL);
    }     
}