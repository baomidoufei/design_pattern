package com.it.principles.demo2.before;

import com.it.principles.demo2.before.Rectangle;

public class Square extends Rectangle {
    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }
}
