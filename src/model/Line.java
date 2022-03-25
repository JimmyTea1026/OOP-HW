package model;

public class Line {
    protected basicObject obj1;
    protected basicObject obj2;
    int X1, X2, Y1, Y2;
    
    public Line(basicObject o1, basicObject o2){
        obj1 = o1;
        obj2 = o2;

    }

    public void getTargetPort(){
        double slope = (obj2.gety1() - obj1.gety1()) / (obj2.getx1() - obj1.getx1());
        int[] obj1Port, obj2Port;
        
        if (slope >= 1){
            obj1Port = obj1.getPortPos(1);
            obj2Port = obj2.getPortPos(3);
        }

    }   
    
}
