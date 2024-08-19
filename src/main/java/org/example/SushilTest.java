package org.example;

import java.util.Scanner;

public class SushilTest {
    public static void main(String[] args) {

        System.out.println("Testing Software for Sushil name and age: ");
        Sushil test = new Sushil();
        Scanner sc = new Scanner(System.in);
        System.out.println("Pls enter a name for testing");
        int count=0;

        String name = sc.nextLine();

        System.out.println("Pls enter a age for testing");
        int age = sc.nextInt();

        test.setName(name);
        test.setAge(age);

        if(test.getName().equals("Sushil")){
            System.out.println("Test case number 1 passed");
            count++;
        }

        else {
            System.err.println("Test case number 2 failed");
        }

        if (test.getAge() == 30){
            System.out.println("Test case number 2 passed");
            count++;
        }
        else{
            System.err.println("Test case number 2 failed");
        }

        System.out.println(count+"/2"+ " test cases passed");
    }
}
