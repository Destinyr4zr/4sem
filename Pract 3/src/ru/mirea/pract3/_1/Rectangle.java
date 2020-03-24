package ru.mirea.pract3._1;

public class Rectangle extends Shape {
    public Rectangle ()
    {
        this.filled = false;
        this.length=1;
        this.width=1;
        this.color="black";
    }
    public  Rectangle (double width, double length)
    {
        this.filled = false;
        this.length = length;
        this.width = width;
        this.color="black";
    }
    public  Rectangle (double width, double length, String colour, boolean filled)
    {
        this.filled = filled;
        this.length = length;
        this.width = width;
        this.color = colour;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea ()
    {
        return width*length;
    }
    @Override
    public double getPerimeter ()
    {
        return 2*(width+length);
    }
    @Override
    public String ToString()
    {
        return "Shape: rectangle, width: " + this.width + ", length: " + this.length + ", colour: "+this.color;
    }
    protected double width;
    protected double length;
}
