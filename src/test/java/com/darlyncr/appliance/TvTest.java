package com.darlyncr.appliance;

import com.darlyncr.animals.Cat;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class TvTest {

    Tv tv;
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
        tv = new Tv("negro",EnergyConsumption.F,20,720,true );

    }

    @AfterEach
    void tearDown() {
        tv = null;
        System.setOut(standardOut);
    }
    @Test
    void testShowFinalPrice() {
        tv.showFinalPrice();
        String expectedOutPut = "El precio final de la tv es: 2600.0";
        String actualOutPut = outputStreamCaptor.toString().trim();
        assertEquals(expectedOutPut, actualOutPut);

    }

    @Test
    void testToString() {
        System.out.println(tv.toString());
        String expectedOutPut = "Televisor{ Resolución = 20 pulgadas, Cuenta con TDT = true, Precio = 2600.0 pesos, Color = 'negro', Consumo de Energía = F, Peso = 720}";
        String actualOutPut = outputStreamCaptor.toString().trim();
        assertEquals(expectedOutPut, actualOutPut);
    }
}