package model;

import java.awt.Color;
import java.awt.Graphics;

public class compositionLine extends Line {

    public compositionLine(basicObject obj1, basicObject obj2){
        this.obj1 = obj1;
        this.obj2 = obj2;
        
    }

    @Override
    public void draw(Graphics g) {
        setPort();
        g.drawLine(portList.get(1).getX()+offset, portList.get(1).getY()+offset, portList.get(2).getX()+offset, portList.get(2).getY()+offset);
        drawHead(g);
        drawPort(g);
    }

    @Override
    public void drawHead(Graphics g) {
        int startx = portList.get(2).getX() + offset;
        int starty = portList.get(2).getY() + offset;
        int endx = portList.get(1).getX();
        int endy = portList.get(1).getY();
        double dx = endx - startx;
        double dy = endy - starty;
        double bodyLength = Math.sqrt(dx*dx + dy*dy);
        double ux = dx/bodyLength;
        double uy = dy/bodyLength;
        double arrowLength = 15;
        int[] triangleX = new int[3];
        int[] triangleY = new int[3];
        
        double theta = 0.4;
        double rotatedX = (Math.cos(theta)*ux + Math.sin(theta)*uy)*arrowLength;
        double rotatedY = (-Math.sin(theta)*ux + Math.cos(theta)*uy)*arrowLength;
        triangleX[0] = (int)(startx+rotatedX);
        triangleY[0] = (int)(starty+rotatedY);

        theta = -0.4;
        rotatedX = (Math.cos(theta)*ux + Math.sin(theta)*uy)*arrowLength;
        rotatedY = (-Math.sin(theta)*ux + Math.cos(theta)*uy)*arrowLength;
        triangleX[1] = (int)(startx+rotatedX);
        triangleY[1] = (int)(starty+rotatedY);
        triangleX[2] = startx;
        triangleY[2] = starty;

        g.setColor(Color.WHITE);
        g.drawPolygon(triangleX, triangleY, 3);
        g.fillPolygon(triangleX, triangleY, 3);
        
    }
}
