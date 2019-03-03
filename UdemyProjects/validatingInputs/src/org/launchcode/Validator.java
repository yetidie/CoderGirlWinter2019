package org.launchcode;

import java.util.Scanner;

public class Validator {


    public int getIntegerBetween(int lower, int upper) {
        Scanner keyboard = new Scanner ( System.in );

        int number;
        do {
            number = keyboard.nextInt ();
            System.out.println ( "Guess again." );
          //  keyboard.skip ( "/n" );
        } while (number != 7);

        return number;
    }

    public int getTensInteger(int lower, int upper) {
        Scanner keyboard = new Scanner ( System.in );
        int number;
        do {

            number = keyboard.nextInt ();
            System.out.println ( "Guess again." );
            //  keyboard.skip ( "/n" );
        } while (number != 230);
        return number;
    }
}




