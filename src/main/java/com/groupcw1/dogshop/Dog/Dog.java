package com.groupcw1.dogshop.Dog;


public class Dog {

    private final long id;
    private final String name;

    public Dog(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}