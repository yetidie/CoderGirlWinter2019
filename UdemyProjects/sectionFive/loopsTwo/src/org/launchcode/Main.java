package org.launchcode;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner thug = new Scanner ( System.in );

        System.out.println ( "Welcome to Bar Chart! \n" );
        System.out.println ( "Give me a number to chart!" );
        int s = thug.nextInt ();
        // int s = 0;
        do {




            for (int count = 0; count <= s; count++) {
                System.out.print ( "#" );
                //count ++;


            }


        }while(s != 0);
            if (s == 0) {
                System.out.println ( "Have a good day!" );
            }
    }
}
