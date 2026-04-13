// Defines the package (folder) this class belongs to
package com.pluralsight;

// Defines the blueprint/class name; must match the filename CreatingVariables.java
public class CreatingVariables {
    // The entry point where the program starts execution
    public static void main(String[] args) {

        // --- Declaring and initializing variables ---

        // Stores a sequence of characters for the Vehicle Identification Number
        String vin = "00W33y1";
        // Stores the manufacturer name as text
        String vehicleModel = "Ford";
        // Stores the color name as text
        String vehicleColor = "Red";
        // Stores a true/false value for towing capability
        boolean hasTowing = true;
        // Stores a whole number for the total distance driven
        int odometer = 101010;
        // Stores a precise decimal number for the monetary value
        double price = 29899.99;
        // Stores a single letter grade using single quotes
        char rating = 'A';
        // Stores a phone number as a whole number (integer)
        int phoneNumber = 150551511;
        // Stores a Social Security Number as a whole number
        int ssn = 77766555;
        // Stores a 5-digit postal code as a whole number
        int zipCode = 77337;

        // --- Performing operations ---

        // Declares a decimal variable for a math calculation
        double firstNumber = 5.2;
        // Declares a second decimal variable
        double secondNumber = 2.5;
        // Declares a third decimal variable
        double thirdNumber = 3.0;

        // Joins (concatenates) the numbers into one String, separated by spaces
        String con = firstNumber + ", " + secondNumber + ", " + thirdNumber;

        // Outputs the combined string "5.2 2.5 3.0" to the console
        System.out.println(con);

    } // Closes the main method
} // Closes the class