package controller;

import utility.*;
import utility.curState.state;
import java.awt.event.*;

public class classActionListener extends myActionListener{

    public classActionListener(curState s){
        super(s);
    }
    
    public void actionPerformed(ActionEvent e){  
        super.appState.currentState = state.CLASS;
        
    }     
}