package com.it.pattern.strategy;

/**
 * @description: 定义环境角色（Context）：用于连接上下文，即把促销活动推销给客户，这里可以理解为销售员
 * @Author : 彭建飞
 */
public class SalesMan {
    //持有抽象策略角色的引用
    private Strategy strategy;
    public SalesMan(Strategy strategy) {
        this.strategy = strategy;
    }
    //向客户展示促销活动
    public void salesManShow(){
        strategy.show();
    }
}

