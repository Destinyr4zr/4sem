package ru.mirea.pract3._1;

public abstract class Shape {
    abstract double getArea();
    abstract double getPerimeter();
    public Shape (String color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }
public Shape ()
{
    this.color = "Transparent";
    this.filled = false;
}

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public String ToString()
    {
        return "Цвет фигуры: "+color+ " и заполненность: " + filled;
    }
    protected String color;
    protected boolean filled;

    public String getColor() {
        return color;
    }
}
