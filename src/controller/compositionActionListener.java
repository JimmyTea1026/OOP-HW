package controller;

import java.util.ArrayList;
import javax.swing.JPanel;
import model.Line;
import model.basicObject;

public class compositionActionListener extends ToolbarBtnActionListener{

    public compositionActionListener(JPanel c, ArrayList <Line> l, ArrayList <basicObject> b){
        super(c);
        lineList = l;
        objList = b;
        AL = new compositionCanvasActionListener(canvas, lineList, objList);
    }
       
}