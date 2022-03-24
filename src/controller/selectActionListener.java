package controller;

import utility.*;
import utility.curState.state;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.JPanel;
import model.Line;
import model.Shape;
import model.basicObject;

public class selectActionListener implements ActionListener{
    private JPanel canvas;
    private selectCanvasActionListener AL;

    public selectActionListener(JPanel c, ArrayList <Shape> s, ArrayList <basicObject> b, ArrayList <Line> l, ArrayList <basicObject> sel){
        canvas = c;
        AL = new selectCanvasActionListener(c, s, b, l, sel);
    }
    
    public void actionPerformed(ActionEvent e){
        canvas.removeMouseListener(canvas.getMouseListeners()[0]);
        canvas.addMouseListener(AL);
    }     
}