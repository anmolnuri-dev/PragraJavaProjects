package com.learning.java.assignments.four;

public abstract class User {
    protected int userId;
    protected String name;
    protected String email;
    protected String phoneNumber;

    public User(int userId, String name, String email, String phoneNumber) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public abstract String getRole();


}
