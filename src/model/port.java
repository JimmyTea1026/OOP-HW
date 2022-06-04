package model;

public class port {
    public int x, y;
    public port(int px, int py){
        this.x = px;
        this.y = py;
    }
    public void resetPos(int px, int py){
        this.x = px;
        this.y = py;
    }
    public int getX(){
        return this.x;
    }
    
    public int getY(){
        return this.y;
    }
}
