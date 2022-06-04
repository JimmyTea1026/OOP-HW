package model;

import java.awt.Graphics;
import java.util.ArrayList;

public abstract class Shape {
    protected int x1, x2, y1, y2;
    protected int depth;
    protected boolean selected;
    protected ArrayList<port> portList = new ArrayList<port>();
    
    public abstract void draw(Graphics g);
    public abstract void setPort();
    public abstract void drawPort(Graphics g);

    // perlocating up for basicObject
    public void resetXY(){};
    public node getNodePointer(){ return null;};
    public void rename(){};
    public boolean isInside(int x, int y){return false;};
    
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

    public void isSelected(boolean b){
        selected = b;
    }
    
}
