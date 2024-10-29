package com.learning.java.oct26.passwordmanager;

public class LoginApp {
    public static void main(String[] args) {

        //current password for app
        LoginManager loginManager = new LoginManager("myuser01","12345");

        // login with my credentials
        loginManager.login("myuser01","123456");


        // robin

        String userName = loginManager.getUserName();

        System.out.println("this is your current username " + userName);

        loginManager.setPassword("MyVeryComplictedPassword");

        loginManager.login("myuser01","MyVeryComplictedPassword");


    }
}
/*

1. replicate username and pasword
2. create class GoogleSheet ---

readonly

write only

read and write both















 */