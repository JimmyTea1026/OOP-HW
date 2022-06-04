package controller;

import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import model.Shape;

public abstract class MenuBtnActionListener implements ActionListener{
    protected JToggleButton selectBtn;
    protected ArrayList <Shape> shapeList;

    public MenuBtnActionListener(JToggleButton b, ArrayList<Shape> s){
        selectBtn = b;
        shapeList = s;
    }
    
    public abstract void actionPerformed(ActionEvent e);
}
