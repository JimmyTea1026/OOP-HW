package controller;

import java.util.ArrayList;
import javax.swing.JPanel;

import model.Shape;

public class selectActionListener extends ToolbarBtnActionListener{

    public selectActionListener(JPanel c, ArrayList <Shape> s){
        super(c);
        AL = new selectCanvasActionListener(canvas, s);
    }

}