package model;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Line extends Shape{
    protected basicObject obj1;
    protected basicObject obj2;
    protected int[] port1, port2;
    public abstract void draw(Graphics g);
    public abstract void drawHead(Graphics g);

    public Line(){};

    public void setObj1(basicObject o1){
        this.obj1 = o1;
    }

    public void setObj2(basicObject o2){
        this.obj2 = o2;
    }

    public void setPort(){
        String obj1Port = null, obj2Port = null;
        if(obj1.gety1() > obj2.gety2()){        // 2在1上面
            
            obj1Port = "up";
            obj2Port = "down";
        }   
        else if(obj1.gety2() < obj2.gety1()){   // 2在1下面
            
            obj1Port = "down";
            obj2Port = "up";
        }
        else{   // 2 和 1 在同一高度
            if(obj1.getx1() > obj2.getx1()){    // 2在1左邊
                
                obj1Port = "left";
                obj2Port = "right";
            }
            else if(obj1.getx1() < obj2.getx1()){    // 2在1右邊
                
                obj1Port = "right";
                obj2Port = "left";
            }
        }
        port1 = obj1.getPortPos(obj1Port);
        port2 = obj2.getPortPos(obj2Port);
    }

    public void drawPort(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillOval(port1[0], port1[1], 8, 8);
        g.fillOval(port2[0], port2[1], 8, 8);
    }
}
