package com.it.pattern.factory.after;

/**
 * @description: TODO(一句话描述该做什么)
 * @Author : 彭建飞
 */
public class AmericanCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffer createCoffee() {
        return new AmericanCoffer();
    }
}
