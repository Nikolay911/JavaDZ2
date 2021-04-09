package com.point;


public class Rectangle extends Shape implements Cloneable {
    private double width;
    private double height;

    public  Rectangle(double x, double y, double width, double height){
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public Point getCenter() {
        point.setX((width+point.getX())/2);
        point.setY((height+point.getY())/2);
        System.out.println("центр квадрата: " + point);
        return point;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return (Rectangle)super.clone();
    }
}
