package controller;

import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.JPanel;
import model.Line;
import model.node;

public class generationActionListener implements ActionListener{
    private JPanel canvas;
    private generationCanvasActionListener AL;

    public generationActionListener(JPanel c, ArrayList <Line> l, ArrayList <node> sel){
        canvas = c;
        AL = new generationCanvasActionListener(c, l, sel);
    }
    
    public void actionPerformed(ActionEvent e){
        canvas.removeMouseListener(canvas.getMouseListeners()[0]);
        canvas.addMouseListener(AL);
    }     
}