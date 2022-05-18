package controller;

import java.util.ArrayList;
import javax.swing.JPanel;
import model.basicObject;

public class usecaseActionListener extends ToolbarBtnActionListener{

    public usecaseActionListener(JPanel c, ArrayList <basicObject> b){
        super(c);
        AL = new usecaseCanvasActionListener(canvas, b);
    }
  
}