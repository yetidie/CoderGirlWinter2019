package org.launchcode;
public class Main {
    public static void main(String[] args) {
        Validator v = new Validator ();

        System.out.println ( "Please enter a number from 1-10." );
        int firstNumber = v.getIntegerBetween ( 1, 10 );
        System.out.println ( "Please enter a number between 200 and 3000 that is a multiple of ten.");
        int secondNumber = v.getTensInteger ( 200, 3000 );
        System.out.println ( "You entered " + firstNumber + " and " +
                secondNumber );
    }
}

