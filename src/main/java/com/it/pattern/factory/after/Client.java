package com.it.pattern.factory.after;

/**
 * @description: TODO(一句话描述该做什么)
 * @Author : 彭建飞
 */
public class Client {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore(new AmericanCoffeeFactory());
        Coffer coffer = coffeeStore.orderCoffee();
        System.out.println(coffer.getName());
    }
}
