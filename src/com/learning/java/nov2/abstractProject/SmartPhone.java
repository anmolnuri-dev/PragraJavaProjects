package com.learning.java.nov2.abstractProject;

public class SmartPhone extends MobilePhone{

    public SmartPhone(String brand, String model, boolean isTouchScreen) {
        super(brand, model, isTouchScreen);
    }

    @Override
    public void sendTextMessages() {
        System.out.println("You can send text messages by touching screen ");
    }

    @Override
    public void playGames() {
        System.out.println("Playing Candy Crush...");
    }

    @Override
    public void storeContacts() {

    }


    @Override
    public void makeCalls() {

    }

    @Override
    public void receiveCalls() {
        super.receiveCalls();
    }

    @Override
    public void leaveVoiceMails() {
        super.leaveVoiceMails();
    }
}
