package com.learning.java.assignments.four;

public class Admin extends User {

    public Admin(int userId, String name, String email, String phoneNumber) {
        super(userId, name, email, phoneNumber);
    }

    @Override
    public String getRole() {
        return "Admin";
    }

}
