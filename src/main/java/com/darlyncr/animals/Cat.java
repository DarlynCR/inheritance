package com.darlyncr.animals;

public class Cat extends Animal{

    public Cat(String name, String food, int age, String breed) {
        super(name, food, age, breed);
    }

    @Override
    public void eat() {
        System.out.println("Cat "+ this.getName() + " eats....");
    }
}
