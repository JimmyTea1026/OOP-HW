package controller;

import utility.*;
import utility.curState.state;
import java.awt.event.*;
import javax.swing.*;

public class renameActionListener extends myActionListener{
    private JToggleButton selectBtn;
    public renameActionListener(curState s, JToggleButton b){
        super(s);
        selectBtn = b;
    }
    
    public void actionPerformed(ActionEvent e){
        super.appState.currentState = state.RENAME;
        selectBtn.setSelected(true);
    } 
}
