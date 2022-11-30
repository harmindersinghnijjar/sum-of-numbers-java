/*

   Programmer: Harminder Singh Nijjar

   Assignment Chapter: Chapter 5

   Purpose:
   A Java program to ask the user for a positive nonzero integer value and then uses a loop to calculate
   the sum of all the integers from 1 to the number entered. For example, if the user enters 50, the loop
   will find the sum of 1, 2, 3, 4, ..., 50.

   Date modified: 11/29/2022

   IDE/Tool used: IntelliJ IDEA

   */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int userInput;
        int sum = 0;

        System.out.println("Please enter a positive nonzero integer value: ");
        userInput = new Scanner(System.in).nextInt();

        // Loop from 1 to the user input
        for (int i = 1; i <= userInput; i++) {
            sum += i;
        }

        System.out.println("The sum of all integers from 1 to " + userInput + " is " + sum);
    }
}