package controller;

import utility.*;
import utility.curState.state;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.JPanel;
import model.Line;
import model.Shape;
import model.basicObject;


public class classActionListener extends myActionListener{

    public classActionListener(curState s){
        super(s);
    }
    
    public void actionPerformed(ActionEvent e){  
        super.appState.currentState = state.CLASS;
        
    }     
}