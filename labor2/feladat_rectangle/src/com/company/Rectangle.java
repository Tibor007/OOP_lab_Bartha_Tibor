package com.company;

public class Rectangle {
    private double length;
    private  double width;

    public Rectangle()
    {

    }
    public Rectangle(double length, double width)
    {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double length)
    {
        this.length = length;
        this.width = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    public void setLength(double length)
    {
        this.length = length;
    }

    @Override
    public String toString()
    {
        return "Rectangle: " + this.width + " * " + this.length;
    }
}
