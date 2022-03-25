package controller;

import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import model.node;

public class ungroupActionListener implements ActionListener{
    private JToggleButton selectBtn;
    private ArrayList <node> selectedList;

    public ungroupActionListener(JToggleButton b, ArrayList<node> select){
        selectBtn = b;
        selectedList = select;
    }
    
    public void actionPerformed(ActionEvent e){
        selectBtn.setSelected(true);
        selectBtn.doClick();
        if(selectedList.size() == 1){
            node root = selectedList.get(0);
            root.ungroup();
            selectedList.clear();
            root = null;
        }
    } 
}
