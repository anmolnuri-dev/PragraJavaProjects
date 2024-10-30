package com.learning.java.oct29.googlesheet;

public class WriteOnlyLoginManager extends LoginManager {

    public WriteOnlyLoginManager(String userName, String password) {
        super(userName, password);
    }

    @Override
    public String getUserName() {
        System.out.println("Read access denied: Cannot retrieve username.");
        return null;
    }
}
