package controller;

import java.util.ArrayList;
import javax.swing.JPanel;
import model.Shape;

public class classActionListener extends ToolbarBtnActionListener{

    public classActionListener(JPanel c, ArrayList <Shape> s){
        super(c);
        AL = new classCanvasActionListener(canvas, s);
    }
}