package view;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

import model.Shape;

public class MyCanvas extends JPanel{
    ArrayList <Shape> shapeList;
    
    public MyCanvas(ArrayList<Shape> s) {
        setBackground(Color.blue);
        setSize(100, 100);     
        shapeList = s;
    }    

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        for(int i = 0; i < shapeList.size(); i++){
            if(shapeList.get(i).getDepth() == -1){
                shapeList.get(i).draw(g);
            }
        }
        for(int i = 0; i < shapeList.size(); i++){
            shapeList.get(i).draw(g);
        }
    }
    
}