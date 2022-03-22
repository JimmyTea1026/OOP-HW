package controller;

import utility.*;
import utility.curState.state;
import java.awt.event.*;
import javax.swing.*;


public class ungroupActionListener extends myActionListener{
    private JToggleButton selectBtn;
    public ungroupActionListener(curState s, JToggleButton b){
        super(s);
        selectBtn = b;
    }
    
    public void actionPerformed(ActionEvent e){
        super.appState.currentState = state.UNGROUP;
        selectBtn.setSelected(true);
    }     
}