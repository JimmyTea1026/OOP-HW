package model;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Line extends Shape{
    protected basicObject obj1;
    protected basicObject obj2;
    protected port port1, port2;
    protected int offset = 3;
    public abstract void drawHead(Graphics g);

    public Line(){};

    public void setObj1(basicObject o1){
        this.obj1 = o1;
    }

    public void setObj2(basicObject o2){
        this.obj2 = o2;
    }

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
        port1 = obj1.getPortPos(obj1PortPos);
        port2 = obj2.getPortPos(obj2PortPos);
    }

    public void drawPort(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillOval(port1.getX(), port1.getY(), 8, 8);
        g.fillOval(port2.getX(), port2.getY(), 8, 8);
    }
}
