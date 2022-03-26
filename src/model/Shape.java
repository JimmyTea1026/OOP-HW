package model;

import java.awt.Graphics;

public abstract class Shape {
    protected int x1, x2, y1, y2;
    protected int depth;
    
    public abstract void draw(Graphics g);
    public abstract void setPort();
    public abstract void drawPort(Graphics g);
    
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

    public void setDepth(int d){
        depth = d;
    }
    
}
