package com.darlyncr.animals;

public abstract class Animal {

    private String name;
    private String food;
    private int age;
    private Object breed;

    public Animal(String name, String food, int age, Object breed) {
        this.name = name;
        this.food = food;
        this.age = age;
        this.breed = breed;
    }

    public abstract void eat();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
