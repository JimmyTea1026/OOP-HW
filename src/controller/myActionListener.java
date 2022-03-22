package controller;

import utility.curState;
import java.awt.event.*;


public class myActionListener implements ActionListener{
    public curState appState;
    public myActionListener(curState s){
        appState = s;
    }
    
    public void actionPerformed(ActionEvent e){  
    }     
}
