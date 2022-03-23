package model;

import java.awt.Graphics;

public class usecaseObject extends basicObject{
    public usecaseObject(int x1, int y1) {
		this.width = 100;
		this.height = 60;
		this.x1 = x1;
		this.y1 = y1;
        this.x2 = x1+width;
        this.y2 = y1+height;
	}

    @Override
	public void draw(Graphics g) {
		g.drawOval(x1, y1, width, height);

		g.setFont(font);	
		g.drawString(name, x1 + 18, y1 + 35);

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
            g.fillOval(portX[i], portY[i], 8, 8);
        }
    }
    
}
