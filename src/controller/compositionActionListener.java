package controller;

import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.JPanel;
import model.Line;
import model.node;

public class compositionActionListener implements ActionListener{
    private JPanel canvas;
    private compositionCanvasActionListener AL;

    public compositionActionListener(JPanel c, ArrayList <Line> l, ArrayList <node> sel){
        canvas = c;
        AL = new compositionCanvasActionListener(c, l, sel);
    }
    
    public void actionPerformed(ActionEvent e){
        canvas.removeMouseListener(canvas.getMouseListeners()[0]);
        canvas.addMouseListener(AL);
    }     
}