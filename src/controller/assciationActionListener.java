package controller;

import utility.*;
import utility.curState.state;
import java.awt.event.*;

public class assciationActionListener extends myActionListener{

    public assciationActionListener(curState s){
        super(s);
    }
    
    public void actionPerformed(ActionEvent e){  
        super.appState.currentState = state.ASSCIATION;
        
    }     
}