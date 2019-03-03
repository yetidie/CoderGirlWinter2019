package org.launchcode;

import java.util.Scanner;

public class Validator {


    public int getIntegerBetween(int lower, int upper) {
        Scanner keyboard = new Scanner ( System.in );

        int number;
        int answer = 7;
        do {

            number = keyboard.nextInt ();
            if (number != answer) {
                //number = keyboard.nextInt ();
                System.out.println ( "Error, invalid number. Try again." );
            }
            //keyboard.skip ( "/n" );}
        } while (number != answer);


        return number;
    }

    public int getTensInteger(int lower, int upper) {
        Scanner keyboard = new Scanner ( System.in );
        int number;
        int answer = 230;
        do {
            number = keyboard.nextInt ();
            if (number != answer) {
                System.out.println ( "Error, invalid number. Try again." );
            }
            //keyboard.skip ( "/n" );}
        } while (number != answer);

        return number;
    }
}




