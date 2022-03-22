package controller;

import utility.*;
import utility.curState.state;
import java.awt.event.*;
import javax.swing.*;


public class groupActionListener extends myActionListener{
    private JToggleButton selectBtn;
    public groupActionListener(curState s, JToggleButton b){
        super(s);
        selectBtn = b;
    }
    
    public void actionPerformed(ActionEvent e){
        super.appState.currentState = state.GROUP;
        selectBtn.setSelected(true);
    }     
}