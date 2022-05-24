package model;

import java.awt.*;
import java.util.ArrayList;
public abstract class basicObject extends Shape{
    protected String name = "undefined";
    protected int width, height;
    protected Font font = new Font(Font.DIALOG, Font.BOLD, 14);
    protected boolean selected;
    protected node nodePointer;
    protected ArrayList<port> portList = new ArrayList<port>();

    public void resetXY(int xXmove, int yMove){
        x1 = x1 + xXmove;
		y1 = y1 + yMove;
		x2 = x1 + width;
		y2 = y1 + height;
        resetPort();
    }
    
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

    public port getPortPos(String s){
        switch(s){
            case("up"):
                return portList.get(0);
            case("right"):
                return portList.get(1);
            case("down"):
                return portList.get(2);
            case("left"):
                return portList.get(3);
            default:
                return null;
        }
		
    }

    public void setPort() {
        int offset = 6;
        port up = new port((x1+x2)/2-offset, y1-offset);
        port right = new port(x2, (y1+y2)/2-offset);
        port down = new port((x1+x2)/2-offset, y2);
        port left = new port(x1-offset, (y1+y2)/2-offset);
        portList.add(up);
        portList.add(right);
        portList.add(down);
        portList.add(left);
    }

    private void resetPort(){
        int offset = 6;
        portList.get(0).resetXY((x1+x2)/2-offset, y1-offset);
        portList.get(1).resetXY(x2, (y1+y2)/2-offset);
        portList.get(2).resetXY((x1+x2)/2-offset, y2);
        portList.get(3).resetXY(x1-offset, (y1+y2)/2-offset);
    }

    public void drawPort(Graphics g){
		for(int i = 0; i < 4; i++){
            g.fillOval(portList.get(i).getX(), portList.get(i).getY(), 8, 8);
		}
	}
}
