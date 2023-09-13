package com.darlyncr.appliance;

public class WashingMachine extends Appliance{

    private int charge;

    public WashingMachine() {}
    public WashingMachine(String color, EnergyConsumption energyConsumption, int weight, int charge) {
        super(color, energyConsumption, weight);
        this.charge = charge;
        createWashingMachine(this.getColor(),this.getEnergyConsumption(),this.getWeight(),this.getCharge());
    }

    private void createWashingMachine(String color, EnergyConsumption energyConsumption, int weight, int charge){
        super.createAppliance(color, energyConsumption, weight);
        this.charge = charge;
        finalpriceWM();
    }

    private void finalpriceWM(){
        super.finalPrice();
        if ( this.charge > 30 ){
            this.setPrice( this.getPrice() + 500 )  ;
        }
    }
    @Override
    public void showFinalPrice() {
        System.out.println("El precio final de la lavadora es: " + this.getPrice());
    }

    public int getCharge() {
        return charge;
    }

    public void setCharge(int charge) {
        this.charge = charge;
    }

    @Override
    public String toString() {
        return "Lavadora {" +
                " Carga = " + charge +
                ", Precio = " + price + " Pesos" +
                ", Color = '" + color + '\'' +
                ", Consumo de Energía = " + energyConsumption +
                ", Peso = " + weight +
                '}';
    }
}
