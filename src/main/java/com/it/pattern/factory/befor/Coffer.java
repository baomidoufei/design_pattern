package com.it.pattern.factory.befor;

/**
 * @description: TODO(一句话描述该做什么)
 * @Author : 彭建飞
 */
public abstract class Coffer {
    public abstract String getName();

     void addSugar(){
        System.out.println("加糖");
    }

    void addMilk(){
        System.out.println("加牛奶");
    }
}
