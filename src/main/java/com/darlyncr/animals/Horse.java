package com.darlyncr.animals;

public class Horse extends Animal{

    public Horse(String name, String food, int age, String breed) {
        super(name, food, age, breed);
    }

    @Override
    public void eat() {
        System.out.println("Horse "+ this.getName() + " eats....");
    }
}
