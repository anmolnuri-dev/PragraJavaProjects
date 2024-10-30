package com.learning.java.oct29.employee;

public class Contractor extends Employee {

    private double contractRate; //contract rate per week
    private int contractLength; //number of weeks worked

    public Contractor(String name, int id, String department, double contractRate, int contractLength) {
        super(name, id, department);
        this.contractRate = contractRate;
        this.contractLength = contractLength;
    }

    @Override
    public double calculateSalary() {
        return getContractLength() * getContractRate();
    }

    @Override
    public void displayEmployeeDetails() {
        super.displayEmployeeDetails();
    }

    public double getContractRate() {
        return contractRate;
    }

    public void setContractRate(double contractRate) {
        this.contractRate = contractRate;
    }

    public int getContractLength() {
        return contractLength;
    }

    public void setContractLength(int contractLength) {
        this.contractLength = contractLength;
    }

}
