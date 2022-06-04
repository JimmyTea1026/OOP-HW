package model;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Line extends Shape{
    protected Shape s1;
    protected Shape s2;
    protected int offset = 3;
    public abstract void drawHead(Graphics g);

    public void setPort(){
        int s1Port = 0, s2Port = 0; //0:up   1:right   2:down  3: left
        if(s1.gety1() > s2.gety2()){        // 2在1上面
            s1Port = 0;
            s2Port = 2;
        }   
        else if(s1.gety2() < s2.gety1()){   // 2在1下面
            
            s1Port = 2;
            s2Port = 0;
        }
        else{   // 2 和 1 在同一高度
            if(s1.getx1() > s2.getx1()){    // 2在1左邊
                
                s1Port = 3;
                s2Port = 1;
            }
            else if(s1.getx1() < s2.getx1()){    // 2在1右邊
                
                s1Port = 1;
                s2Port = 3;
            }
        }
        portList.add(0, s1.getPort(s1Port));
        portList.add(1, s2.getPort(s2Port));
    }

    public void drawPort(Graphics g) {
        g.setColor(Color.BLACK);
        for(int i = 0; i < 2; i++){
            g.fillOval(portList.get(i).getX(), portList.get(i).getY(), 8, 8);
        }
    }
}
