package model;

import java.awt.Color;
import java.awt.Graphics;

public class usecaseObject extends basicObject{
    public usecaseObject(int x1, int y1, node n) {
		this.width = 100;
		this.height = 60;
		this.x1 = x1;
		this.y1 = y1;
        this.x2 = x1+width;
        this.y2 = y1+height;
		this.nodePointer = n;
	}
    
    @Override
	public void draw(Graphics g) {
		g.drawOval(x1, y1, width, height);
		g.setColor(Color.LIGHT_GRAY);
		g.fillOval(x1+1, y1+1, width-2, height-2);
		g.setColor(Color.BLACK);
		g.setFont(font);	
		g.drawString(name, x1 + 18, y1 + 35);

        setPort();
		if (selected){
			drawPort(g);
		}
	}
    
}
