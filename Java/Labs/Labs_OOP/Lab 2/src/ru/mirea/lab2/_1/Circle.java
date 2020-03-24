package ru.mirea.lab2._1;

public class Circle {
    private double x;
    private double y;
    private double r;
    private String colour;
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double getR() {
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }
    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }

    public Circle ()
    {
        this.x = 0;
        this.y = 0;
        this.r = 451;
        this.colour = "Pink!";
    }

    public Circle(double x, double y, double r, String colour) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.colour = colour;
    }

    public double getLength(){
        double c;
        c = 2*Math.PI*r;
        return c;
    }

    @Override
    public String toString() {
        return "Circle{" + "x=" + x + ", y=" + y + ", r=" + r + ", colour='" + colour + '\'' + '}';
    }

}

