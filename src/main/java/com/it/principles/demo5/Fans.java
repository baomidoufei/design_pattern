package com.it.principles.demo5;

public class Fans {
    private String name;

    public Fans(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Fans{" +
                "name='" + name + '\'' +
                '}';
    }
}
