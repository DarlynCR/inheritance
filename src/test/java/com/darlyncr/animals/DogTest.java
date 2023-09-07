package com.darlyncr.animals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    Dog dog;
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
        dog = new Dog("Stich","Carnivoro", 15, BreedsDogs.CHIHUAHUA);
    }

    @AfterEach
    void tearDown() {
        dog = null;
        System.setOut(standardOut);
    }

    @Test
    void eat() {

        dog.eat();
        String expectedOutPut = "Dog Stich eats....";
        String actualOutPut = outputStreamCaptor.toString().trim();
        assertEquals(expectedOutPut, actualOutPut);
    }
}