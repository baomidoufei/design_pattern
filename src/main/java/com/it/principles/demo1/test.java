package com.it.principles.demo1;

public class test {
    public static void main(String[] args) {
        //开闭原则
        SouGouInput input =new SouGouInput();
        //DefaultSkin skin = new DefaultSkin();
        PjfSkin skin =new PjfSkin();
        input.setAbstrackSkin(skin);
        input.display();
    }
}
