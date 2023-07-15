package com.it.pattern.factory.after;

/**
 * @description: TODO(一句话描述该做什么)
 * @Author : 彭建飞
 */
public class CoffeeStore {
    private CoffeeFactory factory;

    public CoffeeStore(CoffeeFactory factory) {
        this.factory = factory;
    }

    public Coffer orderCoffee() {
        Coffer coffee = factory.createCoffee();
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
