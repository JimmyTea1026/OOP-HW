package model;

import java.awt.*;

public abstract class basicObject extends Shape{
    protected String name = "undefined";
    protected int width, height;
    protected Font font = new Font(Font.DIALOG, Font.BOLD, 14);
    protected boolean selected;
    public abstract void draw(Graphics g);
    public abstract void showPort(Graphics g);

    public void rename(String newName){
        name = newName;
    }
    public void beSelected(boolean b){
        selected = b;
    }
    

}
