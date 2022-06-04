package controller;

import java.util.ArrayList;
import javax.swing.JPanel;
import model.Shape;

public class usecaseActionListener extends ToolbarBtnActionListener{

    public usecaseActionListener(JPanel c, ArrayList <Shape> s){
        super(c);
        AL = new usecaseCanvasActionListener(canvas, s);
    }
  
}