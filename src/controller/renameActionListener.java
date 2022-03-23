package controller;

import utility.*;
import utility.curState.state;
import view.renameWindow;

import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import model.basicObject;

public class renameActionListener extends myActionListener{
    private JToggleButton selectBtn;
    public ArrayList <basicObject> selectedList;
    JPanel canvas;

    public renameActionListener(curState s, JToggleButton b, ArrayList select, JPanel c){
        super(s);
        selectBtn = b;
        selectedList = select;
        canvas = c;
    }
    
    public void actionPerformed(ActionEvent e){
        super.appState.currentState = state.SELECT;
        selectBtn.setSelected(true);
        if(selectedList.size() == 1){
            renameWindow renameWindow = new renameWindow();
            basicObject obj = selectedList.get(0);
            String objname = renameWindow.getObjName();
            if(objname != null){
                obj.rename(objname);
            }
            canvas.repaint();
        }
        
    } 
}
