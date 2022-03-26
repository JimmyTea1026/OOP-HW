package model;

import java.awt.Color;
import java.awt.Graphics;

public class compositionLine extends Line {
    
    @Override
    public void draw(Graphics g) {
        g.drawLine(port1[0]+offset, port1[1]+offset, port2[0]+offset, port2[1]+offset);
        setPort();
        drawHead(g);
        drawPort(g);
    }

    @Override
    public void drawHead(Graphics g) {
        int startx = port2[0] + offset;
        int starty = port2[1] + offset;
        int endx = port1[0];
        int endy = port1[1];
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
