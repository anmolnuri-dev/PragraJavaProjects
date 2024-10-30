package com.learning.java.oct29.googlesheet;

public class LoginManager {
    private String userName;
    private String password;


    public LoginManager(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public void login(String userName, String password){

        if(this.userName.equals(userName) && this.password.equals(password)){
            System.out.println("User is authenticated. ");
        }
        else {
            System.out.println("Invalid credentials.");
        }
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
