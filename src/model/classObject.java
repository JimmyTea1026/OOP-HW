package model;

import java.awt.Graphics;

public class classObject extends basicObject{

    public classObject(int x1, int y1) {
		this.width = 100;
		this.height = 120;
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x1 + width;
		this.y2 = y1 + height;
	}

    @Override
	public void draw(Graphics g) {
		g.drawRect(x1, y1, width, height);
		
		int portion = height / 3;
		g.drawLine(x1, y1 + portion, x2, y1 + portion);
		g.drawLine(x1, y1 + portion * 2, x2, y1 + portion * 2);
		
		// find the width for the specified string.
		int stringWidth = g.getFontMetrics(font).stringWidth(name);
		double empty = (Math.abs(x1-x2) - stringWidth)/2;
		g.setFont(font);	
		g.drawString(name, x1 + (int)empty, y1 + 25);

		if (selected){
			showPort(g);
		}
	}

    @Override
    public void showPort(Graphics g) {
        int offset = 5;
        int[] portX = {(x1+x2)/2-offset, x2-offset/2, (x1+x2)/2-offset, x1-offset};
        int[] portY = {y1-offset, (y1+y2)/2-offset, y2-offset, (y1+y2)/2-offset};
        for(int i = 0; i < 4; i++){
            g.drawOval(portX[i], portY[i], 8, 8);
        }
    }
    
}
