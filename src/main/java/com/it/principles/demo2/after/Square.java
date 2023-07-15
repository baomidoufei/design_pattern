package com.it.principles.demo2.after;

import com.it.principles.demo1.DefaultSkin;

public class Square implements Quadrilateral{
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getlength() {
        return 0;
    }

    @Override
    public double getwidth() {
        return 0;
    }
}
