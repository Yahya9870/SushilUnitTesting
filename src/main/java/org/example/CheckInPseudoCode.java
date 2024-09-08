//package org.example;
//
//public class CheckInPseudoCode {
//
//}

/**

 BEGIN
 // Initialise available spaces for the pet (as given in the problem statement)
 SET dogSpaces=32
 SET catSpaces=12

 // Create a scanner object for taking user input
 INITIALIZE Scanner input

 // Loop until user chooses to exit
 WHILE true DO
   PRINT "Select an option: 1. Check-In Pet 2. EXIT"
   READ from the user choice    (read means in programming is taking input)
   IF choice is 1 THEN
      PRINT "Enter Pet Type (Dog or Cat):"
      READ petType from user
      IF petType is Dog AND dogSpaces>0 THEN
         DECREMENT dogSpaces by 1
         PRINT "Dog checked in successfully. Remaining dog spaces: " + dogSpaces"

        PRINT "Enter Length of Stay (days):"
        READ dayStays from the user
        IF dayStays > = 2 THEN
          PRINT "Do you want your dog to be groomed? (yes/no):"
          READ groomingInput from the user
         IF groomingInput is yes THEN
           PRINT("Your dog has been groomed successfully")
         ELSE
           PRINT("Sorry, for grooming stay must be at least 2 days")
      ELSE IF petType is cat and catSpaces>0 THEN
         DECREMENT catSpaces by 1
         PRINT(" Cat checked in successfully. Remaining cat spaces: " + catSpaces")


     ELSE
       PRINT "No space available for " + petType + "s or invalid input."


   ELSE IF choice is 2 THEN
      PRINT "Exiting the system GOOD BYE ! ! !"
      BREAK the loop




   ELSE
     PRINT " Invalid choice. Please enter 1 or 2"
     ENDIF
 ENDWHILE


 END










 */
