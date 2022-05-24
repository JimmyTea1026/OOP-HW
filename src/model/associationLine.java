package model;

import java.awt.Graphics;

public class associationLine extends Line {
    @Override
    public void draw(Graphics g) {
        setPort();
        g.drawLine(port1.getX()+offset, port1.getY()+offset, port2.getX()+offset, port2.getY()+offset);
        drawHead(g);
        drawPort(g);
    }

    @Override
    public void drawHead(Graphics g) {
        int startx = port2.getX()+offset;
        int starty = port2.getY()+offset;
        int endx = port1.getX();
        int endy = port1.getY();
        double dx = endx - startx;
        double dy = endy - starty;
        double bodyLength = Math.sqrt(dx*dx + dy*dy);
        double ux = dx/bodyLength;
        double uy = dy/bodyLength;
        double theta = 0.5;
        double arrowLength = 15;

        double rotatedX = (Math.cos(theta)*ux + Math.sin(theta)*uy)*arrowLength;
        double rotatedY = (-Math.sin(theta)*ux + Math.cos(theta)*uy)*arrowLength;
        g.drawLine(startx, starty, (int)(startx+rotatedX), (int)(starty+rotatedY));
        theta = -0.5;
        rotatedX = (Math.cos(theta)*ux + Math.sin(theta)*uy)*arrowLength;
        rotatedY = (-Math.sin(theta)*ux + Math.cos(theta)*uy)*arrowLength;
        g.drawLine(startx, starty, (int)(startx+rotatedX), (int)(starty+rotatedY));
        
    }
}
