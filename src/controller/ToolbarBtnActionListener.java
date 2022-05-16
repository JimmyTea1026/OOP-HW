package controller;

import java.awt.event.*;
import javax.swing.JPanel;

public abstract class ToolbarBtnActionListener implements ActionListener{
    protected JPanel canvas;

    public ToolbarBtnActionListener(JPanel c){
        canvas = c;
    }
    
    public abstract void actionPerformed(ActionEvent e);
}