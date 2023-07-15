package com.it.principles.demo2.before;

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setLength(20);
        resize(rectangle);
        print(rectangle);
        System.out.println("===============");
        Square square = new Square();
        square.setLength(20);
        resize(square);
        print(square);
        //得出结论，正方形不是长方形的子类，因为不满足里氏代换原则
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
