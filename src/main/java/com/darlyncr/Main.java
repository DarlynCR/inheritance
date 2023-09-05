package com.darlyncr;
import com.darlyncr.animals.Animal;
import com.darlyncr.animals.Cat;
import com.darlyncr.animals.Dog;
import com.darlyncr.animals.Horse;

public class Main {
    public static void main(String[] args) {

        Animal dog = new Dog("Stich","Carnivoro", 15, "Doberman");
        dog.eat();

        Animal dog2 = new Dog("Teddy","Croquetas", 10, "Chihuahua");
        dog2.eat();

        Animal cat = new Cat("Pelusa","Galletas", 15, "Siamés");
        cat.eat();

        Animal horse = new Horse("Spark","Pasto", 15, "Fino");
        horse.eat();


    }
}