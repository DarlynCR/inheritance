package com.darlyncr.animals;

public abstract class Animal {

    private String name;
    private String food;
    private int age;
    private String breed;

    public Animal(String name, String food, int age, String breed) {
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
