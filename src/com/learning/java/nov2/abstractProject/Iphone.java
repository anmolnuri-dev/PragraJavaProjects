package com.learning.java.nov2.abstractProject;

public class Iphone extends SmartPhone{


    public Iphone(String brand, String model, boolean isTouchScreen) {
        super(brand, model, isTouchScreen);
    }

    public void makeFaceTime(){
        System.out.println("You can make video calls using FaceTime.");

    }
    @Override
    public void sendTextMessages() {
        System.out.println("Send text messages via iMessage.");
    }

    @Override
    public void playGames() {

    }

    @Override
    public void storeContacts() {
        super.storeContacts();
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
