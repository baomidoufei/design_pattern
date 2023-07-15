package com.it.pattern.singleton.demo2;

/**
 * @description: TODO(一句话描述该做什么)
 * @Author : 彭建飞
 */
public class Test {
    public static void main(String[] args) {
        singleton instance = singleton.getInstance();
        singleton instance2 = singleton.getInstance();
        System.out.println(instance==instance2);
    }
}
