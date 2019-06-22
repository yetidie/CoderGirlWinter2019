package org.launchcode;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println ( "What is the height of the pyramid needed? (No more than 23.)" );
        Scanner mario = new Scanner ( System.in );
        int step = mario.nextInt ();
        int width = 0;
        int col= 0;

//        while(a >= ) {
 //       }

 //       if(a <= 0; a >= 24){


        for(col = 1; col < step; col++){


            for(width = 1; width <= step; width++ ){
                System.out.print("#");
            }
            System.out.println (" ");
        }



    }
}
