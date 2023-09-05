package com.darlyncr.animals;

public class Dog extends Animal{

    public Dog(String name, String food, int age, String breed) {
        super(name, food, age, breed);
    }

    @Override
    public void eat() {
        System.out.println("Dog "+ this.getName() + " eats....");
    }
}
