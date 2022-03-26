package model;

import java.awt.*;

public abstract class basicObject extends Shape{
    protected String name = "undefined";
    protected int width, height;
    protected Font font = new Font(Font.DIALOG, Font.BOLD, 14);
    protected boolean selected;
    protected node nodePointer;
    protected int[][] port = new int[4][2];
    public abstract void draw(Graphics g);
    public abstract void resetXY(int xMove, int yMove);

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

    public int[] getPortPos(String s){
		int ret[] = new int[2];
        switch(s){
            case("up"):
                ret[0] = port[0][0];
                ret[1] = port[0][1];
                break;
            case("right"):
                ret[0] = port[1][0];
                ret[1] = port[1][1];
                break;
            case("down"):
                ret[0] = port[2][0];
                ret[1] = port[2][1];
                break;
            case("left"):
                ret[0] = port[3][0];
                ret[1] = port[3][1];
                break;
        }
		return ret;
    }

    public void setPort() {
        int offset = 6;
        // 上右下左
        int[] portX = {(x1+x2)/2-offset, x2, (x1+x2)/2-offset, x1-offset};
        int[] portY = {y1-offset, (y1+y2)/2-offset, y2, (y1+y2)/2-offset};
        for(int i = 0; i < 4; i++){
			port[i][0] = portX[i];
			port[i][1] = portY[i];
        }
    }

    public void drawPort(Graphics g){
		for(int i = 0; i < 4; i++){
            g.fillOval(port[i][0], port[i][1], 8, 8);
		}
	}
}
