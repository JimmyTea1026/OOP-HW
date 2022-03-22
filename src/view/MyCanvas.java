package view;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

import model.Shape;

public class MyCanvas extends JPanel{
    ArrayList <Shape> ShapeList;

    public MyCanvas(ArrayList a) {
        setBackground(Color.blue);
        setSize(100, 100);    
        ShapeList = a;    
    }    

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for(int i = 0; i < ShapeList.size(); i++){
            Shape obj = ShapeList.get(i);
            obj.draw(g);
        }
    }
    
}