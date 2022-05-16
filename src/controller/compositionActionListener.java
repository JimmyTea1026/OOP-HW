package controller;

import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.JPanel;
import model.Line;
import model.basicObject;

public class compositionActionListener extends ToolbarBtnActionListener{
    private compositionCanvasActionListener AL;

    public compositionActionListener(JPanel c, ArrayList <Line> l, ArrayList <basicObject> b){
        super(c);
        AL = new compositionCanvasActionListener(canvas, l, b);
    }
    
    public void actionPerformed(ActionEvent e){
        canvas.removeMouseListener(canvas.getMouseListeners()[0]);
        canvas.addMouseListener(AL);
    }     
}