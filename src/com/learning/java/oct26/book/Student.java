package com.learning.java.oct26.book;

import com.learning.java.oct26.encap.Counter;

public  class Student {


    String id;
    String name;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
class MyStudent extends Student {

    public MyStudent(String id, String name) {
        super(id, name);
    }
}

class MainTest {
    public static void main(String[] args) {

      //  Student student = new Student("101","Student");
        MyStudent student = new MyStudent("101","test");
        final int count  = 0;
        Counter counter = new Counter();

    }

}
