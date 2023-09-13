package com.darlyncr.appliance;

public class Appliance {

    protected Double price;
    protected String color;
    protected EnergyConsumption energyConsumption;
    protected int weight;

    public Appliance() { }

    public Appliance( String color, EnergyConsumption energyConsumption, int weight) {
        this.color = color;
        this.energyConsumption = energyConsumption;
        this.weight = weight;
        createAppliance(this.getColor(), this.getEnergyConsumption(), this.getWeight());
    }

    private void checkEnergyConsumption(char letter){
        switch (letter){
            case 'A':
                this.energyConsumption = EnergyConsumption.A;
                break;
            case 'F':
                this.energyConsumption = EnergyConsumption.F;
                break;
            default:
                this.energyConsumption = EnergyConsumption.F;
                break;
        }

    }

    private void checkColor(String color){
        switch (color.toLowerCase()){
            case "blanco":
                this.color = color;
                break;
            case "negro":
                this.color = color;
                break;
            case "rojo":
                this.color = color;
                break;
            case "azul":
                this.color = color;
                break;
            case "gris":
                this.color = color;
                break;
            default:
                this.color = "blanco";
                break;
        }
    }

    protected void createAppliance(String color, EnergyConsumption energyConsumption, int weight){
        this.price = 1000.0;
        this.color = color;
        this.energyConsumption = energyConsumption;
        this.weight = weight;
        checkEnergyConsumption(energyConsumption.toString().charAt(0));
        checkColor(color);
    }

    protected void finalPrice(){

        if(this.weight >= 1 && this.weight <=  19){
            this.price = this.price + 100;
        } else if (this.weight >= 20 && this.weight <=  49) {
            this.price = this.price + 500;
        } else if (this.weight >= 50 && this.weight <=  79) {
            this.price = this.price + 800;
        } else if (this.weight >= 80) {
            this.price = this.price + 1000;
        } else {
            this.price = this.price + 0;
        }

        switch (this.energyConsumption.toString().charAt(0)){
            case 'A':
                this.price = this.price +1000;
            break;
            case 'B':
                this.price = this.price +800;
                break;
            case 'C':
                this.price = this.price +600;
                break;
            case 'D':
                this.price = this.price +500;
                break;
            case 'E':
                this.price = this.price +300;
                break;
            case 'F':
                this.price = this.price +100;
                break;
            default:
                this.price = this.price + 0;
                break;

        }


    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public EnergyConsumption getEnergyConsumption() {
        return energyConsumption;
    }

    public void setEnergyConsumption(EnergyConsumption energyConsumption) {
        this.energyConsumption = energyConsumption;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


}
