package com.point;

public class Line extends Shape implements Cloneable {
    private double a2;
    private double b2;

    public Line(double a1, double b1, double a2, double b2){
        super(a1,b1);
        this.a2=a2;
        this.b2=b2;
    }

    @Override
    public Point getCenter() {
        point.setX((a2+point.getX())/2);
        point.setY((b2+point.getY())/2);

        System.out.println("центр отрезка: " + point);
        return point;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return (Line)super.clone();
    }
}
