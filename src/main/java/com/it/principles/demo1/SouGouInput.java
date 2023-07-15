package com.it.principles.demo1;

public class SouGouInput {
    private AbstrackSkin abstrackSkin;

    public void setAbstrackSkin(AbstrackSkin abstrackSkin) {
        this.abstrackSkin = abstrackSkin;
    }
    public void display(){
        abstrackSkin.display();
    }
}
