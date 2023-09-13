package com.darlyncr.appliance;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Appliance> appliances = new ArrayList<Appliance>(4);

        printExcercise("1");

        WashingMachine washingMachine = new WashingMachine( "blanco", EnergyConsumption.A, 50, 30);
        Tv tv = new Tv("negro",EnergyConsumption.F,20,720,true );

        System.out.println(washingMachine.toString());
        washingMachine.showFinalPrice();
        System.out.println(tv.toString());
        tv.showFinalPrice();

        printExcercise("2");

        WashingMachine washingMachine2 = new WashingMachine( "negro", EnergyConsumption.F, 60, 40);
        Tv tv2 = new Tv("gris",EnergyConsumption.A,40,1080,true );

        appliances.add(washingMachine);
        appliances.add(tv);
        appliances.add(washingMachine2);
        appliances.add(tv2);


        iterateListAppliances(appliances);


    }

    private static void iterateListAppliances(ArrayList<Appliance> appliances) {

        Double totalPrice = 0.0;
        Double totalPriceWM = 0.0;
        Double totalPriceTv = 0.0;

        for (Appliance appliance: appliances) {

           totalPrice += appliance.getPrice();

           if (appliance instanceof WashingMachine){

               totalPriceWM += appliance.getPrice();
               System.out.println("Lavadora "+ appliance.getColor());
               appliance.showFinalPrice();

           }else {

               totalPriceTv += appliance.getPrice();
               System.out.println("Televisor "+ appliance.getColor());
               appliance.showFinalPrice();

           }
        }

        System.out.println("El precio total de las lavadoras es: " + totalPriceWM);
        System.out.println("El precio total de los televisores es: " + totalPriceTv);
        System.out.println("El precio total de los electrodomesticos es: " + totalPrice);

    }


    private static void printExcercise(String exercise) {
        System.out.println("------------------------------------------------");
        System.out.println("Ejercicio No. " + exercise);
        System.out.println("------------------------------------------------");


    }

}