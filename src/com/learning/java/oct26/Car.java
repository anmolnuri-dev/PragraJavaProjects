package com.learning.java.oct26;

public class Car extends Vehicle{


    int fuelCap = 50;


    public Car(int fuelCap, int fuelCap1) {
        super(fuelCap);
        this.fuelCap = fuelCap1;
    }

    public void printCarDetails(){
        System.out.println("Fuel Cap for Car : " + fuelCap);

        System.out.println("Fuel Cap of Vehicle " + super.fuelCap);
        super.displayVehicleDetails();
    }

}
