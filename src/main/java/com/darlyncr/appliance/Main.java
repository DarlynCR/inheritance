package com.darlyncr.appliance;


public class Main {
    public static void main(String[] args) {

        WashingMachine washingMachine = new WashingMachine( "blanco", EnergyConsumption.A, 50, 30);

        Tv tv = new Tv("negro",EnergyConsumption.F,20,720,true );

        System.out.println(washingMachine.toString());
        washingMachine.showFinalPrice();
        System.out.println(tv.toString());
        tv.showFinalPrice();
    }
}