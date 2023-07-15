package com.it.principles.demo4.after;

public class Client {
    public static void main(String[] args) {
        HeiMaSafetyDoor heiMaSafetyDoor = new HeiMaSafetyDoor();
        heiMaSafetyDoor.antiTheft();
        heiMaSafetyDoor.fireproof();
        heiMaSafetyDoor.waterproof();
        System.out.println("============");
        pjfDoor pjfDoor =new pjfDoor();
        pjfDoor.antiTheft();
        pjfDoor.fireproof();
    }
}
