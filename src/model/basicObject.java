package model;

import java.awt.*;

public abstract class basicObject extends Shape{
    protected String name = "undefined";
    protected int width, height;
    protected Font font = new Font(Font.DIALOG, Font.BOLD, 14);
    protected boolean selected;
    protected node nodePointer;
    public abstract void draw(Graphics g);
    public abstract void showPort(Graphics g);

    public void rename(String newName){
        name = newName;
    }

    public void beSelected(boolean b){
        selected = b;
    }

    public void setNodePointer(node n){
        nodePointer = n;
    }

    public node getNodePointer(){
        return this.nodePointer;
    }

    

}
