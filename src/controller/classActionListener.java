package controller;

import java.util.ArrayList;
import javax.swing.JPanel;
import model.basicObject;

public class classActionListener extends ToolbarBtnActionListener{

    public classActionListener(JPanel c, ArrayList <basicObject> b){
        super(c);
        AL = new classCanvasActionListener(canvas, b);
    }
}