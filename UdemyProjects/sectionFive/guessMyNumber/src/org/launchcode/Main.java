
	package org.launchcode;
//import java.util.Scanner;
//import java.util.Random;

        public class Main {

            public static void main(String[] args) {
                //Scanner keyboard = new Scanner ( System.in );
                guess g = new guess ();


                System.out.println ( "Want to play a game?" );
                g.guessingGame ( 1, 100 );
                g.playAgain ();


            }
        }



