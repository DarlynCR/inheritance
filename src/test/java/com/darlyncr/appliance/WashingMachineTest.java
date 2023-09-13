package com.darlyncr.appliance;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class WashingMachineTest {

    WashingMachine washingMachine;
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
        washingMachine = new WashingMachine( "blanco", EnergyConsumption.A, 50, 30);

    }

    @AfterEach
    void tearDown() {
        washingMachine = null;
        System.setOut(standardOut);
    }

    @Test
    void showFinalPrice() {
        washingMachine.showFinalPrice();
        String expectedOutPut = "El precio final de la lavadora es: 2800.0";
        String actualOutPut = outputStreamCaptor.toString().trim();
        assertEquals(expectedOutPut, actualOutPut);
    }

    @Test
    void testToString() {
        System.out.println(washingMachine.toString());
        String expectedOutPut = "Lavadora { Carga = 30, Precio = 2800.0 Pesos, Color = 'blanco', Consumo de Energía = A, Peso = 50}";
        String actualOutPut = outputStreamCaptor.toString().trim();
        assertEquals(expectedOutPut, actualOutPut);
    }
}