package org.launchcode;
import java.util.Scanner;
import java.util.Random;

public class experiment {


    public class Main {

        public void main(String[] args) {

            System.out.println ( "Want to play a game?" );
            guessingGame ( 1, 100 );
            playAgain ();


        }



        public void guessingGame(int lower, int upper) {
            Scanner keyboard = new Scanner ( System.in );
            Random think = new Random(2);


            int answer = think.nextInt (100);


            int number;
            System.out.println ( "I'm thinking of a number between 1 and 100. What is it?" );
            do {
                number = keyboard.nextInt ();
                System.out.println ( "Guess: " + number );

                if(number > 100) {
                    System.out.println ( "Oops! That number isn't between 1 and 100. Try again." );
                }
                else if (number > answer) {

                    System.out.println ( "My number is lower." );

                } else if (number < answer) {
                    System.out.println ( "My number is higher." );
                } else if (number == answer) {
                    System.out.println ( "You got it! My number is " + answer + "." );
                    playAgain ();
                }



            } while (number != answer);



        }


        public void playAgain() {
            Scanner keyboard = new Scanner ( System.in );

            System.out.println ( "Play again? (Y/N)" );
            String end = keyboard.nextLine ().toLowerCase ();


            if (end.equals ( "y" )) {

                guessingGame ( 1, 100 );

            } else if(end.equals ( "n" )) {
                System.out.println ( "Another time then!" );
                System.out.println ("\n");


            }
            else{
                System.out.println ( "Error: invalid input. Try again." );

            }

        }
    }
}
