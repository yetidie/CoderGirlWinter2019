package org.launchcode;

import java.util.Scanner;
//import java.util.Random;

public class guess {


    public void guessingGame(int lower, int upper) {
        Scanner keyboard = new Scanner ( System.in );

        int answer = 33;


        int number;
        System.out.println ( "I'm thinking of a number between 1 and 100. What is it?" );
        do {
            number = keyboard.nextInt ();
            if (number > 100) {
                System.out.println ( "Oops! That number isn't between 1 and 100. Try again." );
            } else if (number > answer) {

                System.out.println ( "My number is lower." );

            } else if (number < answer) {
                System.out.println ( "My number is higher." );
            } else if (number == answer) {
                System.out.println ( "You got it! My number is " + answer + "." );
                playAgain ();
            }

            System.out.println ( "Guess: " + number );

        } while (number != answer);



    }


    public void playAgain() {
        Scanner keyboard = new Scanner ( System.in );

        System.out.println ( "Play again?" );
        String end = keyboard.nextLine ().toLowerCase ();


        if (end.equals ( "yes" )) {

            guessingGame ( 1, 100 );

        } else if (end.equals ( "no" )) System.out.println ( "Another time then!" );
        else {
            System.out.println ( "Error: invalid input. Try again." );
            playAgain ();
        }

    }
}

