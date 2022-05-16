package controller;

import java.util.ArrayList;
import javax.swing.JPanel;
import model.Line;
import model.basicObject;

public class generationActionListener extends ToolbarBtnActionListener{

    public generationActionListener(JPanel c, ArrayList <Line> l, ArrayList <basicObject> b){
        super(c);
        lineList = l;
        objList = b;
        AL = new generationCanvasActionListener(canvas, lineList, objList);
    }
    
}