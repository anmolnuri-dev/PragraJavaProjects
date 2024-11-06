package com.learning.java.nov2.abstractProject;

public abstract class Phone {

    private final String brand;
    private final String model;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public abstract void makeCalls();
    public abstract void receiveCalls();
    public abstract void leaveVoiceMails();

}
