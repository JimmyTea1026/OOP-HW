package controller;

import java.util.ArrayList;
import javax.swing.JPanel;
import model.Shape;

public class generationActionListener extends ToolbarBtnActionListener{

    public generationActionListener(JPanel c, ArrayList <Shape> s){
        super(c);
        AL = new generationCanvasActionListener(canvas, s);
    }
    
}