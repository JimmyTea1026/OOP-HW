package model;

import java.awt.Color;
import java.awt.Graphics;

public class generationLine extends Line {
    @Override
    public void draw(Graphics g) {
        setPort();
        g.drawLine(port1.getX()+offset, port1.getY()+offset, port2.getX()+offset, port2.getY()+offset);
        drawHead(g);
        drawPort(g);
    }
    
    @Override
    public void drawHead(Graphics g) {
        int startx = port2.getX() + offset;
        int starty = port2.getY() + offset;
        int endx = port1.getX();
        int endy = port1.getY();
        double dx = endx - startx;
        double dy = endy - starty;
        double bodyLength = Math.sqrt(dx*dx + dy*dy);
        double ux = dx/bodyLength;
        double uy = dy/bodyLength;
        double arrowLength = 15;
        int[] squareX = new int[4];
        int[] squareY = new int[4];
        squareX[0] = startx;
        squareY[0] = starty; 
        double theta = 0.4;
        double rotatedX = (Math.cos(theta)*ux + Math.sin(theta)*uy)*arrowLength;
        double rotatedY = (-Math.sin(theta)*ux + Math.cos(theta)*uy)*arrowLength;
        squareX[1] = (int)(startx+rotatedX);
        squareY[1] = (int)(starty+rotatedY);
        squareX[2] = (int)(startx + ux*25);
        squareY[2] = (int)(starty + uy*25);

        theta = -0.4;
        rotatedX = (Math.cos(theta)*ux + Math.sin(theta)*uy)*arrowLength;
        rotatedY = (-Math.sin(theta)*ux + Math.cos(theta)*uy)*arrowLength;
        squareX[3] = (int)(startx+rotatedX);
        squareY[3] = (int)(starty+rotatedY);
        
        g.setColor(Color.WHITE);
        g.drawPolygon(squareX, squareY, 4);
        g.fillPolygon(squareX, squareY, 4);
        
    }
}
