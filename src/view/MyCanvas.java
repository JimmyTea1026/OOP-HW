package view;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

import model.Line;
import model.Shape;
import model.basicObject;

public class MyCanvas extends JPanel{
    ArrayList <basicObject> objList;
    ArrayList <Line> lineList;
    
    public MyCanvas(ArrayList o, ArrayList l) {
        setBackground(Color.blue);
        setSize(100, 100);    
        objList = o;
        lineList = l;   
    }    

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for(int i = 0; i < objList.size(); i++){
            Shape obj = objList.get(i);
            obj.draw(g);
        }
    }
    
}