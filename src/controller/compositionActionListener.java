package controller;

import java.util.ArrayList;
import javax.swing.JPanel;
import model.Line;
import model.Shape;


public class compositionActionListener extends ToolbarBtnActionListener{

    public compositionActionListener(JPanel c, ArrayList <Shape> s){
        super(c);
        AL = new compositionCanvasActionListener(canvas, s);
    }
       
}