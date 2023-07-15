package com.it.principles.demo6.after;

public class Test {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        White color = new White();
        electricCar.setColor(color);
        electricCar.getColor().colorKind();//白色
        electricCar.run();//电动汽车
        System.out.println("==============");
        PetrolCar petrolCar = new PetrolCar();
        petrolCar.setColor(new Black());
        petrolCar.getColor().colorKind();
        petrolCar.run();
    }
}
