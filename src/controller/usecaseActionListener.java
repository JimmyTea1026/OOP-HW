package controller;

import utility.*;
import utility.curState.state;
import java.awt.event.*;

public class usecaseActionListener extends myActionListener{

    public usecaseActionListener(curState s){
        super(s);
    }
    
    public void actionPerformed(ActionEvent e){  
        super.appState.currentState = state.USECASS;
        
    }     
}