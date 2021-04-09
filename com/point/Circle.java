package com.point;

public class Circle extends Shape implements Cloneable {
    private double radius;

    public  Circle(double x, double y, double radius){
        super(x,y);
        this.radius = radius;
    }

    @Override
    public Point getCenter() {
        System.out.println("центр круга: " + point);
        return point;
    }

    @Override
    public Circle clone() throws CloneNotSupportedException {
        return (Circle)super.clone();
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
