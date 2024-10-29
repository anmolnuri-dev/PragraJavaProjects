package com.learning.java.oct19.demo;

public class Student {
    String id;
    String name;


    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
class StudentMain {

    public static void main(String[] args) {

        Student s = new Student("101","Sumit");
        System.out.println(s.toString());

    }
}
