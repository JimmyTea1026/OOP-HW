package controller;

import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.JPanel;
import model.basicObject;

public class classActionListener implements ActionListener{
    private JPanel canvas;
    private classCanvasActionListener AL;

    public classActionListener(JPanel c, ArrayList <basicObject> b){
        canvas = c;
        AL = new classCanvasActionListener(c, b);
    }
    
    public void actionPerformed(ActionEvent e){
        canvas.removeMouseListener(canvas.getMouseListeners()[0]);
        canvas.addMouseListener(AL);
    }     
}