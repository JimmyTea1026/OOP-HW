package controller;

import java.util.ArrayList;
import javax.swing.JPanel;
import model.Line;
import model.basicObject;

public class assciationActionListener extends ToolbarBtnActionListener{
    public assciationActionListener(JPanel c, ArrayList <Line> l, ArrayList <basicObject> b){
        super(c);
        lineList = l;
        objList = b;
        AL = new associationCanvasActionListener(canvas, lineList, objList);
    }
}