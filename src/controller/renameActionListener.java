package controller;

import utility.*;
import utility.curState.state;
import view.renameWindow;

import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import model.basicObject;
import model.node;

public class renameActionListener implements ActionListener{
    private JToggleButton selectBtn;
    public ArrayList <node> selectedList;
    JPanel canvas;

    public renameActionListener(curState s, JToggleButton b, ArrayList<node> select, JPanel c){
        selectBtn = b;
        selectedList = select;
        canvas = c;
    }
    
    public void actionPerformed(ActionEvent e){
        selectBtn.setSelected(true);
        selectBtn.doClick();
        if(selectedList.size() == 1){
            ArrayList <basicObject> n = selectedList.get(0).traverse();
            if (n.size() == 1){
                renameWindow renameWindow = new renameWindow();
                String objname = renameWindow.getObjName();
                if(objname != null){
                    n.get(0).rename(objname);
                }
            }
            canvas.repaint();
        }
    } 
}
