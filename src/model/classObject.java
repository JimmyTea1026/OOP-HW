package model;

import java.awt.Color;
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
		g.setColor(Color.BLACK);
		g.drawRect(x1, y1, width, height);
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(x1+1, y1+1, width-1, height-1);
		
		int portion = height / 3;
		g.setColor(Color.BLACK);
		g.drawLine(x1, y1 + portion, x2, y1 + portion);
		g.drawLine(x1, y1 + portion * 2, x2, y1 + portion * 2);
		
		// find the width for the specified string.
		int stringWidth = g.getFontMetrics(font).stringWidth(name);
		double empty = (Math.abs(x1-x2) - stringWidth)/2;
		g.setFont(font);	
		g.drawString(name, x1 + (int)empty, y1 + 25);
		setPort();
		if (selected){
			drawPort(g);
		}
	}
}
