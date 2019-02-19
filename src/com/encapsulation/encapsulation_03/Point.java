package com.encapsulation.encapsulation_03;

public class Point {
   private double x;
   private double y;

   

    public int getX() {
        return (int)x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return (int)y;
    }

    public void setY(int y) {
        this.y = y;
    }



    public void setDoubleX(double x) {
        this.x = x;
    }

    public void setDoubleY(double y) {
        this.y = y;
    }

    public double getDoubleX(){
        return x;
    }
    public double getDoubleY(){
        return y;
    }
}
