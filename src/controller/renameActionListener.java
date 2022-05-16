package controller;

import view.renameWindow;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import model.basicObject;
import model.node;

public class renameActionListener extends MenuBtnActionListener{
    private JPanel canvas;

    public renameActionListener(JToggleButton b, ArrayList<node> select, JPanel c){
        super(b, select);
        canvas = c;
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        selectBtn.setSelected(true);
        selectBtn.doClick();
        if(selectedList.size() == 1){
            ArrayList <basicObject> n = selectedList.get(0).getAllObj();
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
