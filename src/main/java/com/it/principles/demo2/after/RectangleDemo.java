package com.it.principles.demo2.after;

import com.it.principles.demo2.after.Rectangle;

public class RectangleDemo {
    public static void main(String[] args) {
        com.it.principles.demo2.after.Rectangle rectangle = new com.it.principles.demo2.after.Rectangle();
        rectangle.setLength(20);
        rectangle.setWidth(10);
        resize(rectangle);
        print(rectangle);
    }
    public static void resize(Rectangle rectangle){
        while(rectangle.getWidth()<=rectangle.getLength()){
            rectangle.setWidth(rectangle.getWidth()+1);
        }
    }

    public static void print(Rectangle rectangle){
        System.out.println("长:"+rectangle.getLength());
        System.out.println("宽:"+rectangle.getWidth());
    }
}
