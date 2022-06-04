package controller;

import java.util.ArrayList;
import javax.swing.JPanel;
import model.Shape;
public class assciationActionListener extends ToolbarBtnActionListener{
    public assciationActionListener(JPanel c, ArrayList <Shape> s){
        super(c);
        AL = new associationCanvasActionListener(canvas, s);
    }
}