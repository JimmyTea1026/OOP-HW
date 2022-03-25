package controller;

import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.JPanel;
import model.basicObject;

public class usecaseActionListener implements ActionListener{
    private JPanel canvas;
    private usecaseCanvasActionListener AL;

    public usecaseActionListener(JPanel c, ArrayList <basicObject> b){
        canvas = c;
        AL = new usecaseCanvasActionListener(c, b);
    }
    
    public void actionPerformed(ActionEvent e){
        canvas.removeMouseListener(canvas.getMouseListeners()[0]);
        canvas.addMouseListener(AL);
    }     
}