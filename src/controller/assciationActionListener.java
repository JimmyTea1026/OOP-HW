package controller;

import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.JPanel;
import model.Line;
import model.basicObject;

public class assciationActionListener implements ActionListener{
    private JPanel canvas;
    private associationCanvasActionListener AL;

    public assciationActionListener(JPanel c, ArrayList <Line> l, ArrayList <basicObject> b){
        canvas = c;
        AL = new associationCanvasActionListener(c, l, b);
    }
    
    public void actionPerformed(ActionEvent e){
        canvas.removeMouseListener(canvas.getMouseListeners()[0]);
        canvas.addMouseListener(AL);
    }     
}