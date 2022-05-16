package controller;

import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import model.node;

public abstract class MenuBtnActionListener implements ActionListener{
    protected JToggleButton selectBtn;
    protected ArrayList <node> selectedList;

    public MenuBtnActionListener(JToggleButton b, ArrayList<node> select){
        selectBtn = b;
        selectedList = select;
    }
    
    public abstract void actionPerformed(ActionEvent e);
}
