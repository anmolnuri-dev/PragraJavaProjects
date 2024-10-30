package com.learning.java.oct29.googlesheet;

public class ReadOnlyLoginManager extends LoginManager {

    public ReadOnlyLoginManager(String userName, String password) {
        super(userName, password);
    }

    @Override
    public void setPassword(String password) {
        System.out.println("Write access denied: Cannot set password.");
    }

}
