package com.learning.java.oct15;

public class Student {
    String id;
    String name;
    double salary;

    public Student(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void printDetails() {
        System.out.println(this.id);
        System.out.println(this.name);
        System.out.println(this.salary);
    }

    public String toString() {
        return "Student{id='" + this.id + '\'' + ", name='" + this.name + '\'' + ", salary=" + this.salary + '}';
    }
}
