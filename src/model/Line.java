package model;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Line extends Shape{
    protected basicObject obj1;
    protected basicObject obj2;
    protected int offset = 3;
    public abstract void drawHead(Graphics g);

    public void setPort(){
        String obj1PortPos = null, obj2PortPos = null;
        if(obj1.gety1() > obj2.gety2()){        // 2在1上面
            
            obj1PortPos = "up";
            obj2PortPos = "down";
        }   
        else if(obj1.gety2() < obj2.gety1()){   // 2在1下面
            
            obj1PortPos = "down";
            obj2PortPos = "up";
        }
        else{   // 2 和 1 在同一高度
            if(obj1.getx1() > obj2.getx1()){    // 2在1左邊
                
                obj1PortPos = "left";
                obj2PortPos = "right";
            }
            else if(obj1.getx1() < obj2.getx1()){    // 2在1右邊
                
                obj1PortPos = "right";
                obj2PortPos = "left";
            }
        }
        portList.add(obj1.getPort(obj1PortPos));
        portList.add(obj2.getPort(obj2PortPos));
    }

    public void drawPort(Graphics g) {
        g.setColor(Color.BLACK);
        for(int i = 0; i < 2; i++){
            g.fillOval(portList.get(i).getX(), portList.get(i).getY(), 8, 8);
        }
    }
}
