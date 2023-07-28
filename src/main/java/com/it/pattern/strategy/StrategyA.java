package com.it.pattern.strategy;

/**
 * @description: 为春节活动定义的策略类
 * @Author : 彭建飞
 */

public class StrategyA implements Strategy{
    @Override
    public void show() {
        System.out.println("买一送一");
    }
}
