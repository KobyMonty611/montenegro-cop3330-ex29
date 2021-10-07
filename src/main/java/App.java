/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Koby Montenegro
 */

package org.example;

import java.util.Scanner;

 class Main
 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        boolean valid = false;

        while(valid==false) {

            try {
                System.out.print("What is the rate of return? ");
                int rate = Integer.parseInt(scan.nextLine());
                //At this point it will check if the rate is valid, if not then one of the exceptions will occur.
                System.out.println("It will take " + (72 / rate) + " years to double your initial investment.");
                valid=true;
            } catch (NumberFormatException e) {
                //This is to prevent a string being inputted.
                System.out.println("Sorry. That's not a valid input.");
                valid=false;
            } catch (ArithmeticException e) {
                //This is to prevent 0 being inputted.
                System.out.println("Sorry. That's not a valid input.");
                valid=false;
            }

            if(valid==true)
            {
                break;
            }
        }
        scan.close();
    }
}