package model;

import java.awt.Graphics;
import java.awt.Point;

public abstract class Shape {
    protected int x1, x2, y1, y2;
    protected int depth;
    protected boolean grouped;
    
    public abstract void draw(Graphics g);
    public abstract void showPort(Graphics g);

    
    public int getx1(){
        return x1;
    }
    public int getx2(){
        return x2;
    }
    public int gety1(){
        return y1;
    }
    public int gety2(){
        return y2;
    }

    public void resetXY(int newX1,int newX2,int newY1,int newY2){
        x1 = newX1;
        x2 = newX2;
        y1 = newY1;
        y2 = newY2;
    }
}
