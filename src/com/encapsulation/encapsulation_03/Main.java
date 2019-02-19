package com.encapsulation.encapsulation_03;

public class Main {
   public static void main(String[]args){
       Point p = new Point();
       p.setX(4);
       p.setY(5);

       int cordinateX = p.getX();
       int cordinateY = p.getY();

       p.setDoubleX(3);
       p.setDoubleY(2);

       double coordinateDoubleX = p.getDoubleX();
       double coordinateDoubleY= p.getDoubleY();


       System.out.println(cordinateX);
       System.out.println(cordinateY);
       System.out.println(coordinateDoubleX);
       System.out.println(coordinateDoubleY);

      int g= p.getX();
       System.out.println("Last "+g);
   }


}
