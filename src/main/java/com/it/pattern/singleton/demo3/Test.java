package com.it.pattern.singleton.demo3;

import com.it.pattern.singleton.demo1.Singleton;

/**
 * @description: TODO(一句话描述该做什么)
 * @Author : 彭建飞
 */
public class Test {
    public static void main(String[] args) {
        com.it.pattern.singleton.demo1.Singleton instance = com.it.pattern.singleton.demo1.Singleton.getInstance();
        com.it.pattern.singleton.demo1.Singleton instance1 = Singleton.getInstance();
        //说明两者访问是同一个对象
        System.out.println(instance==instance1);
        System.out.println(instance.equals(instance1));
    }
}
