package controller;

import utility.*;
import utility.curState.state;
import java.awt.event.*;

public class generationActionListener extends myActionListener{

    public generationActionListener(curState s){
        super(s);
    }
    
    public void actionPerformed(ActionEvent e){  
        super.appState.currentState = state.GENERATION;
        
    }     
}