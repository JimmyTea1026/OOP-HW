package controller;

import utility.*;
import utility.curState.state;
import java.awt.event.*;

public class compositionActionListener extends myActionListener{

    public compositionActionListener(curState s){
        super(s);
    }
    
    public void actionPerformed(ActionEvent e){  
        super.appState.currentState = state.COMPOSITION;
        
    }     
}