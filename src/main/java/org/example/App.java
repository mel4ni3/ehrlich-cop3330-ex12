/*
 *  UCF COP3330 Fall 2021 Assignment 12 Solution
 *  Copyright 2021 Melanie Ehrlich
 */

package org.example;
import java.util.*;

public class App {

    public static void main(String[] args) {

        float principal, interest, investment;
        int amtYears;

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the principal: ");
        principal = s.nextFloat();
        System.out.print("Enter the rate of interest: ");
        interest = s.nextFloat();

        if ((interest % 1) > 1) {
            System.out.print("Enter a valid percent value.:");
            interest = s.nextFloat();
        }

        System.out.print("Enter the number of years: ");
        amtYears = s.nextInt();
        interest /= 100;
        investment  = principal * (1 + interest * amtYears);
        System.out.print("After " + amtYears + " years at " + (interest*100) + "%, the investment will be worth $" + Math.round(investment * 10)/10.0 + ".");
    }
}