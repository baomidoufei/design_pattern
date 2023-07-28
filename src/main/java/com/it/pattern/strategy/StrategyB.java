package com.it.pattern.strategy;

/**
 * @description: 为中秋活动定义的活动策略类
 * @Author : 彭建飞
 */
public class StrategyB implements Strategy{
    @Override
    public void show() {
        System.out.println("满200元减50元");
    }
}
