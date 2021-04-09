package com.point;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Point(){
        x = 0;
        y = 0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Point translate(double x1, double y1){
        x+=x1;
        y+=y1;
        return this;
    }
    public Point scale(double koef){
        x*=koef;
        y*=koef;
        return this;
    }
    public String toString(){
        return "("+x+", "+y+")";
    }
}

