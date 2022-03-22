package controller;

import utility.*;
import utility.curState.state;
import java.awt.event.*;

public class selectActionListener extends myActionListener{

    public selectActionListener(curState s){
        super(s);
    }
    
    public void actionPerformed(ActionEvent e){
        super.appState.currentState = state.SELECT;
    }     
}