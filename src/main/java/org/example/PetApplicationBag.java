package org.example;

import java.util.Scanner;

public class PetApplicationBag {

    public static void main(String[] args) {
        // Initialize variables for available spaces and fees
        int dogSpaces = 30; // Available spaces for dogs
        int catSpaces = 12; // Available spaces for cats
        double amountDue = 0.0; // Total amount due for checkout
        Scanner input = new Scanner(System.in); // Scanner for input

        while (true) { // Loop until user chooses to exit
            System.out.println("Select an option: 1. Check-In Pet 2. Check-Out Pet 3. Exit");
            int choice = input.nextInt(); // Read user's choice
            input.nextLine(); // Consume newline

            if (choice == 1) { // Pet Check-In
                // Step: Determine pet type and check for boarding space
                System.out.println("Enter Pet Type (Dog or Cat):");
                String petType = input.nextLine();

                if (petType.equalsIgnoreCase("Dog") && dogSpaces > 0) {
                    // If pet is a dog and space is available
                    dogSpaces--; // Assign the pet to a space
                    System.out.println("Dog checked in successfully. Remaining dog spaces: " + dogSpaces);
                    // Step: Gather information on the length of the stay
                    System.out.println("Enter Length of Stay (days):");
                    int daysStay = input.nextInt();
                    input.nextLine(); // Consume newline

                    if (daysStay >= 2) {

                        System.out.println("Do you want your dog to be groomed? (yes/no): ");
                        String groomingInput = input.nextLine();
                        if (groomingInput.equalsIgnoreCase("yes")){

                            System.out.println("Your dog has been groomed");
                        }


                    }
                    else {
                        System.out.println("Sorry, for grooming stay must be at least 2 days");
                    }



                } else if (petType.equalsIgnoreCase("Cat") && catSpaces > 0) {
                    // If pet is a cat and space is available
                    catSpaces--; // Assign the pet to a space
                    System.out.println("Cat checked in successfully. Remaining cat spaces: " + catSpaces);
                } else {
                    // If no space is available or invalid input
                    System.out.println("No space available for " + petType + "s or invalid input.");

                }

            } else if (choice == 2) { // Pet Check-Out
                // Step: Identify the pet and its boarding space
                System.out.println("Enter Pet Type (Dog or Cat):");
                String petType = input.nextLine();

                // Step: Gather information on the length of the stay
                System.out.println("Enter Length of Stay (days):");
                int daysStay = input.nextInt();
                input.nextLine(); // Consume newline

                if (petType.equalsIgnoreCase("Dog") && dogSpaces < 30) {
                    // Check-out process for dogs
                    // Step: Determine if the pet had a grooming fee
                    if (daysStay >= 2) { // Grooming is only available if staying 2 or more days
                        System.out.println("Did the dog have grooming? (yes/no): ");
                        String groomingInput = input.nextLine();
                        if (groomingInput.equalsIgnoreCase("yes")) {
                            amountDue += 24.95; // Add grooming fee
                        }
                    }
                    // Calculate the boarding fee for the stay duration
                    amountDue += daysStay * 29.0; // Flat rate boarding fee for simplicity
                    dogSpaces++; // Mark the boarding space as vacant
                    System.out.println("Dog checked out. Total fee: $" + amountDue);

                } else if (petType.equalsIgnoreCase("Cat") && catSpaces < 12) {
                    // Check-out process for cats
                    // Calculate the boarding fee for the stay duration
                    amountDue = daysStay * 18.0; // Flat rate boarding fee for cats
                    catSpaces++; // Mark the boarding space as vacant
                    System.out.println("Cat checked out. Total fee: $" + amountDue);
                } else {
                    // If invalid check-out or no such pet is checked in
                    System.out.println("Invalid check-out. No such pet type checked in or invalid input.");
                }

            } else if (choice == 3) { // Exit the system
                System.out.println("Exiting the system. Goodbye!");
                break; // Exit the loop
            } else {
                // Invalid menu option
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }
        input.close(); // Close the scanner
    }
}

