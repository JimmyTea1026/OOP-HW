package controller;

import java.awt.event.*;
import javax.swing.JPanel;
import javax.swing.event.MouseInputListener;

public class ToolbarBtnActionListener implements ActionListener{
    protected JPanel canvas;
    protected MouseInputListener AL;

    public ToolbarBtnActionListener(JPanel c){
        canvas = c;
    }
    
    public void actionPerformed(ActionEvent e){
        canvas.removeMouseListener(canvas.getMouseListeners()[0]);
        canvas.addMouseListener(AL);
    }  
}