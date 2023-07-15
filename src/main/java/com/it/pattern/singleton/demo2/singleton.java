package com.it.pattern.singleton.demo2;

import com.it.pattern.singleton.demo1.Singleton;

/**
 * @description: 饿汉模式，静态代码块
 * @Author : 彭建飞
 */
public class singleton {
    private singleton(){}
    private static singleton instance;
    static {
        instance =new singleton();
    }
    public static singleton getInstance(){
        return instance;
    }
}
