package org.launchcode;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println ("What number should we count to?");
        Scanner num = new Scanner ( System.in );
        int did = num.nextInt ();
        int number = 0;

        while(number >= 0){
            System.out.print (number + " ");
            number --;
        }

        System.out.println (" ");
        number = did;

        while(number >= 0){
            System.out.print (number + " ");
            number --;
        }
    }
}
