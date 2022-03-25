package controller;

import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.JPanel;
import model.Line;

public class assciationActionListener implements ActionListener{
    private JPanel canvas;
    private associationCanvasActionListener AL;

    public assciationActionListener(JPanel c, ArrayList <Line> l){
        canvas = c;
        AL = new associationCanvasActionListener(c, l);
    }
    
    public void actionPerformed(ActionEvent e){
        canvas.removeMouseListener(canvas.getMouseListeners()[0]);
        canvas.addMouseListener(AL);
    }     
}