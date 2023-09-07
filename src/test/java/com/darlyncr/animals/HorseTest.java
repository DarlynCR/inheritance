package com.darlyncr.animals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class HorseTest {

    Horse horse;
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
        horse = new Horse("Spark","Pasto", 15, BreedsHorses.PURA_SANGRE);
    }

    @AfterEach
    void tearDown() {
        horse = null;
        System.setOut(standardOut);
    }

    @Test
    void eat() {

        horse.eat();
        String expectedOutPut = "Horse Spark eats....";
        String actualOutPut = outputStreamCaptor.toString().trim();
        assertEquals(expectedOutPut, actualOutPut);
    }
}