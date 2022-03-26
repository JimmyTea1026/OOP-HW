package model;

import java.awt.Graphics;

public class associationLine extends Line {
    @Override
    public void draw(Graphics g) {
        setPort();
        g.drawLine(port1[0], port1[1], port2[0], port2[1]);
        drawHead(g);
        drawPort(g);
    }

    
    @Override
    public void drawHead(Graphics g) {
        int startx = port2[0];
        int starty = port2[1];
        int endx = port1[0];
        int endy = port1[1];
        double dx = endx - startx;
        double dy = endy - starty;
        double bodyLength = Math.sqrt(dx*dx + dy*dy);
        double ux = dx/bodyLength;
        double uy = dy/bodyLength;
        double theta = 0.5;
        double arrowLength = bodyLength / 18;

        double rotatedX = (Math.cos(theta)*ux + Math.sin(theta)*uy)*arrowLength;
        double rotatedY = (-Math.sin(theta)*ux + Math.cos(theta)*uy)*arrowLength;
        g.drawLine(startx, starty, (int)(startx+rotatedX), (int)(starty+rotatedY));
        theta = -0.5;
        rotatedX = (Math.cos(theta)*ux + Math.sin(theta)*uy)*arrowLength;
        rotatedY = (-Math.sin(theta)*ux + Math.cos(theta)*uy)*arrowLength;
        g.drawLine(startx, starty, (int)(startx+rotatedX), (int)(starty+rotatedY));
        
    }
}
