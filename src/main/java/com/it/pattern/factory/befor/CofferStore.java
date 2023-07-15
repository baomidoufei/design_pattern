package com.it.pattern.factory.befor;

import com.it.pattern.factory.befor.Coffer;

/**
 * @description: TODO(一句话描述该做什么)
 * @Author : 彭建飞
 */
public class CofferStore {
    public Coffer cofferOrder(String type){
        Coffer coffer = null;
        if ("american".equals(type)){
            coffer = new AmericanCoffer();
        }else if( "latte".equals(type)){
            coffer = new LatteCoffer();
        }else{
            throw new RuntimeException("您点的咖啡不存在");
        }
        coffer.addMilk();
        coffer.addSugar();
        return coffer;
    }
}
