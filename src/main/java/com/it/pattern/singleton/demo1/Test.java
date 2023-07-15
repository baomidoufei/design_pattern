package com.it.pattern.singleton.demo1;

public class Test {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        //说明两者访问是同一个对象
        System.out.println(instance==instance1);
        System.out.println(instance.equals(instance1));

    }
}
