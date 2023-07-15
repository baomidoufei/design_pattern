package com.it.pattern.singleton.demo1;
/**
 * @description: 饿汉模式，静态成员变量
 * @Author : 彭建飞
 */
public class Singleton {
    //构造私有方法
    private Singleton(){
    }
    //在本类中创建本类对象,因为静态方法不能直接访问非静态的成员变量，所以加个static修饰成员变量
    private static Singleton instance =new Singleton();
    //创建一个公共的访问方式，让外界访问，因为外界不能创建该类，所以在方法加个static成为静态方法外界才能调用
    public static Singleton getInstance(){
        return instance;
    }
}
