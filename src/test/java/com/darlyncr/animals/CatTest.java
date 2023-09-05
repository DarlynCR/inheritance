package com.darlyncr.animals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {
    Animal cat;
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();



    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
        cat = new Cat("Pelusa","Galletas", 15, "Siamés");

    }

    @AfterEach
    void tearDown() {
        cat = null;
        System.setOut(standardOut);
    }

    @Test
    void eatTest() {

        cat.eat();
        String expectedOutPut = "Cat Pelusa eats....";
        String actualOutPut = outputStreamCaptor.toString().trim();
        assertEquals(expectedOutPut, actualOutPut);
    }
}