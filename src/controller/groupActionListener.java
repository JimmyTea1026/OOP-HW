package controller;

import utility.*;
import utility.curState.state;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import model.basicObject;


public class groupActionListener extends myActionListener{
    private JToggleButton selectBtn;
    public ArrayList <basicObject> selectedList;
    public groupActionListener(curState s, JToggleButton b, ArrayList select){
        super(s);
        selectBtn = b;
        selectedList = select;
    }
    
    public void actionPerformed(ActionEvent e){
        super.appState.currentState = state.SELECT;
        selectBtn.setSelected(true);
    }     
}