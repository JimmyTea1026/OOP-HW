package controller;

import java.util.ArrayList;
import javax.swing.JPanel;

import model.basicObject;
import model.node;

public class selectActionListener extends ToolbarBtnActionListener{

    public selectActionListener(JPanel c, ArrayList <basicObject> b, ArrayList <node> sel){
        super(c);
        objList = b;
        selectedList = sel;
        AL = new selectCanvasActionListener(canvas, objList, selectedList);
    }

}