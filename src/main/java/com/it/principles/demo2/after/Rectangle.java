package com.it.principles.demo2.after;

public class Rectangle implements Quadrilateral{
    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getlength() {
        return length;
    }

    @Override
    public double getwidth() {
        return width;
    }
}
