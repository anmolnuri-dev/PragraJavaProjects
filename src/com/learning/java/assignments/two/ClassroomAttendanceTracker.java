package com.learning.java.assignments.two;

import java.util.Scanner;

public class ClassroomAttendanceTracker {

    String[] studentsPresent;

    public ClassroomAttendanceTracker(String[] names) {
        this.studentsPresent = names;
    }

    public boolean checkAttendance(String name) {
        boolean check = false;
        for (String student : studentsPresent) {
            if (student.equalsIgnoreCase(name)) {
                check = true;
                break;
            }
        }
        return check;
    }

    public static void main(String[] args) {
        // List of students who were present
        String[] studentsPresent = {"Reece", "Nico", "Chris", "Cole", "Joao"};

        // Create an instance of ClassroomAttendanceTracker
        ClassroomAttendanceTracker attendanceTracker = new ClassroomAttendanceTracker(studentsPresent);
        Scanner sc = new Scanner(System.in);
        String exit;

        do {
            // User input to check attendance
            System.out.println("Enter the student's name to check if they attended the class:");
            String studentName = sc.nextLine();

            // Check if the student attended
            if (attendanceTracker.checkAttendance(studentName)) {
                System.out.println(studentName + " was present in the class.");
            } else {
                System.out.println(studentName + " was not present in the class.");
            }
            System.out.print("Did you want to continue? (Y/N): ");
            exit = sc.nextLine();
        } while (exit.equalsIgnoreCase("y"));

        sc.close();
    }
}

