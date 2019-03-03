package org.launchcode;
import java.util.Scanner;
//import java.util.Random;

public class guess {

    int answer = 100;
    public int guessingGame(){
        Scanner keyboard = new Scanner ( System.in );
        int number = keyboard.nextInt (  );
        int answer = 33;
        do{

            System.out.println ("Guess" + keyboard.nextInt ());
            if(number > answer){

                System.out.println ("My number is lower.");

            }else if (number < answer) {
                System.out.println ("My number is higher.");
            }else if (number = answer) {
                System.out.println ("Oops! That number isn't between 1 and 100. Try again.");
            } else {
                System.out.println ("You got it! My number is " + answer + ".");
            }
        }while(number != answer);
    }

    public String playAgain(){
        Scanner yon = new Scanner(System.in);

        System.out.println ("Play again?");
        String end = yon.nextLine ().toLowerCase ();

        if ("yes") {
            System.out.println ("I'm thinking of a number between 1 and 100. What is it?");

        }else if("no"){
            System.out.println ("Another time then!");
        }else{
            System.out.println ("Error: invalid input. Try again.");
        }



    }



}
