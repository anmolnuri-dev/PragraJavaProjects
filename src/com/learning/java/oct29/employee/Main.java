package com.learning.java.oct29.employee;

public class Main {
    public static void main(String[] args) {
        Employee[] emp = new Employee[3];

        emp[0] = new FullTimeEmployee("Sunny", 101, "IT", 180000);
        emp[1] = new PartTimeEmployee("Anmol", 102, "IT", 60, 80);
        emp[2] = new Contractor("Surinder", 103, "Marketing", 5000, 8);

        for (Employee e : emp) {
            e.displayEmployeeDetails();
            System.out.println("Calculated Salary: " + e.calculateSalary());
            System.out.println();
        }
    }
}
