package com.learning.java.oct29.employee;

public class FullTimeEmployee extends Employee {
    private double annualSalary;


    public FullTimeEmployee(String name, int id, String department, double annualSalary) {
        super(name, id, department);
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculateSalary() {
        return getAnnualSalary();
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

}
