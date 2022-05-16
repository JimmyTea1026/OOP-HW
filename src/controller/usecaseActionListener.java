package controller;

import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.JPanel;
import model.basicObject;

public class usecaseActionListener extends ToolbarBtnActionListener{
    private usecaseCanvasActionListener AL;

    public usecaseActionListener(JPanel c, ArrayList <basicObject> b){
        super(c);
        AL = new usecaseCanvasActionListener(canvas, b);
    }
    
    public void actionPerformed(ActionEvent e){
        canvas.removeMouseListener(canvas.getMouseListeners()[0]);
        canvas.addMouseListener(AL);
    }     
}