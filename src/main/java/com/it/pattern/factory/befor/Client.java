package com.it.pattern.factory.befor;

import com.it.pattern.factory.befor.Coffer;

/**
 * @description: TODO(一句话描述该做什么)
 * @Author : 彭建飞
 */
public class Client {
    public static void main(String[] args) {
        CofferStore store = new CofferStore();
        Coffer coffer = store.cofferOrder("american");
        System.out.println(coffer.getName());
    }
}
