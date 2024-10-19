package com.learning.java.assignments.two;

import java.util.Scanner;

public class FlightBookingSystem {
    public int numOfDestinations = 5;
    String [] destinationsArr;

    public FlightBookingSystem(String[] destinations) {
        if(destinations.length == numOfDestinations) {
            this.destinationsArr = destinations;
        }
        else {
            System.out.println("Error: The number of destinations provided does not match the expected size in the Flight Booking System.");
        }
    }

    public void searchDestination(String des) {
        boolean check = false;
        for(String s: destinationsArr) {
            if(s.equalsIgnoreCase(des)) {
                check = true;
                System.out.println("The " + des + " is available for booking.");
            }
        }
        if(!check) {
            System.out.println("The " + des + " is not available for booking.");
        }
    }

    public void updateDestination(String existingDes, String updateDes) {
        boolean found = false;
        for(int i = 0; i < destinationsArr.length; i++) {
            if(destinationsArr[i].equalsIgnoreCase(existingDes)) {
                destinationsArr[i] = updateDes;
                found = true;
                System.out.println(existingDes + " has been replaced with " + updateDes);
                break;
            }
        }
        if(!found) {
            System.out.println(existingDes + " was not found.");
        }
    }

    public void display() {
        System.out.println("Flight Booking System Available Destination List:");
        for (String s: destinationsArr) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        // Sample destinations
        String[] initialDestinations = {"New York", "London", "Toronto", "Sydney", "Paris"};

        // Creating a FlightBookingSystem instance
        FlightBookingSystem flightSystem = new FlightBookingSystem(initialDestinations);

        // Displaying available destinations
        flightSystem.display();

        Scanner sc = new Scanner(System.in);

        // Searching for a destination
        flightSystem.searchDestination("Toronto");
        flightSystem.searchDestination("Berlin");
        //Using user input
        System.out.print("Enter a destination to check availability: ");
        String des = sc.nextLine();
        flightSystem.searchDestination(des);

        // Updating a destination
        flightSystem.updateDestination("Sydney", "Dubai");
        flightSystem.updateDestination("Berlin", "Amsterdam");
        //Using user input
        System.out.print("Enter the existing destination name: ");
        String existing = sc.nextLine();
        System.out.print("Enter the updated destination name: ");
        String updated = sc.nextLine();
        flightSystem.updateDestination(existing,updated);


        // Displaying the updated list of destinations
        flightSystem.display();

        sc.close();
    }
}