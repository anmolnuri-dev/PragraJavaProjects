package com.learning.java.oct26.encap;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee("101","Varun");

        String employeeId = employee.getEmployeeId();
        System.out.println(employeeId);

        employee.setEmployeeName("Alok");
        System.out.println(employee);

        Counter counter = new Counter();

        counter.counter = 50;

        System.out.println(counter.incrementCounter());


    }
}
