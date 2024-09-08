package org.example;

public class ArrayExample {
    public static void main(String[] args) {
        int num[]={1,2,3}; // indices 0,1 and 2
        try {
            System.out.println(num[100]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("ArrayIndexOutOfBoundsException took place pls enter within the array range");
        }

        finally {
            System.out.println("This finally block will run always.");
        }



    }
}
