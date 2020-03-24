package ru.mirea.pract3._1;

public class Square extends Rectangle {
    public Square ()
    {
        this.filled = false;
        this.color = "green";
        this.length = 1;
        this.width = this.length;
    }
    public Square (double side)
    {
        this.filled = false;
        this.color = "green";
        this.length = side;
        this.width = this.length;
    }
    public Square (double side, String colour, boolean filled)
    {
        this.filled = filled;
        this.color = colour;
        this.length = side;
        this.width = this.length;
    }
    public double getSide ()
    {
        return length;
    }
    public void setSide (double side)
    {
        this.length = side;
        this.width = this.length;
    }
    @Override
    public double getArea ()
    {
        return length*length;
    }
    @Override
    public double getPerimeter ()
    {
        return 4*length;
    }
    @Override
    public  String ToString ()
    {
        return "Shape: square, side: " + this.length + ", colour: "+this.color;
    }
}
