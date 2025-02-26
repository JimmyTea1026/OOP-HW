package model;

import java.awt.Graphics;

public class associationLine extends Line {
    public associationLine(Shape s1, Shape s2){
        this.s1 = s1;
        this.s2 = s2;
    }
    @Override
    public void draw(Graphics g) {
        setPort();
        g.drawLine(portList.get(0).getX()+offset, portList.get(0).getY()+offset, portList.get(1).getX()+offset, portList.get(1).getY()+offset);
        drawHead(g);
        drawPort(g);
    }

    @Override
    public void drawHead(Graphics g) {
        int startx = portList.get(1).getX() + offset;
        int starty = portList.get(1).getY() + offset;
        int endx = portList.get(0).getX();
        int endy = portList.get(0).getY();
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
