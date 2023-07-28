package com.it.pattern.strategy;

/**
 * @description: TODO(一句话描述该做什么)
 * @Author : 彭建飞
 */
public class StrategyTest {
    public static void main(String[] args) {
        SalesMan salesMan = new SalesMan(new StrategyB());
        salesMan.salesManShow();
    }
}
