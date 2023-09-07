package com.darlyncr.appliance;

public class Tv extends Appliance implements ShowPrice{

    private int resolution;
    private Boolean tunerTDT;

    public Tv() {
    }

    public Tv(String color, EnergyConsumption energyConsumption, int weight, int resolution, Boolean tunerTDT) {
        super(color, energyConsumption, weight);
        this.resolution = resolution;
        this.tunerTDT = tunerTDT;
        createTv(this.getColor(),this.getEnergyConsumption(),this.getResolution(), this.getWeight(), this.getTunerTDT());
    }


    private void createTv(String color, EnergyConsumption energyConsumption, int weight, int resolution, Boolean tunerTDT){
        super.createAppliance(color, energyConsumption, weight);
        this.resolution = resolution;
        this.tunerTDT = tunerTDT;
        finalprice();
    }

    private void finalprice(){
        super.finalPrice();

        if ( this.tunerTDT ){
            this.setPrice( this.getPrice() + 500 )  ;
        }
        if ( this.resolution > 40 ){
            this.setPrice( this.getPrice() + (this.getPrice() * 0.3) ) ;
        }

    }

    @Override
    public void showFinalPrice() {
        System.out.println("El precio final de la tv es: " + this.getPrice());
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public Boolean getTunerTDT() {
        return tunerTDT;
    }

    public void setTunerTDT(Boolean tunerTDT) {
        this.tunerTDT = tunerTDT;
    }


}
