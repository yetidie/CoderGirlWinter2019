package org.launchcode;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner ( System.in );

        System.out.println ("Want to play a game?");
        System.out.println ("I'm thinking of a number between 1 and 100. What is it?");

        int guess = 0;
        System.out.println ("Guess:" + guess);


        System.out.println (" Oops, That number isn't between 1 and 100. Try again.");

        System.out.println ("My number is higher.");

        System.out.println ("My number is lower");


        int answer = 0;
        System.out.println ("You got it! My number was " + answer);


        System.out.println ("Play again?");


	// write your code here
    }
}
