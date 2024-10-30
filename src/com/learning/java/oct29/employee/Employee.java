package com.learning.java.oct29.employee;

public class Employee {
    private String name;
    private int id;
    private String department;

    public Employee() {
        this.name = null;
        this.id = 0;
        this.department = null;
    }

    public Employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    public double calculateSalary(){
        return 0.0;
    }

    public void displayEmployeeDetails(){
        System.out.println("Employee Name: " + getName());
        System.out.println("Employee ID: " + getId());
        System.out.println("Employee Department: " + getDepartment());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
