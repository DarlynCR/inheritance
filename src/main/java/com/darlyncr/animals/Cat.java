package com.darlyncr.animals;

public class Cat extends Animal{

    public Cat(String name, String food, int age, BreedsCats breed) {
        super(name, food, age, breed);
    }

    @Override
    public void eat() {
        System.out.println("Cat "+ this.getName() + " eats....");
    }
}
