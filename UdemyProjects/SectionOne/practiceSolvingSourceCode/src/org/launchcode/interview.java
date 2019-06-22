package org.launchcode;
import java.util.Scanner;

public class interview {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        String name;
        int favoriteNumber;
        System.out.println ("Hi, I'm going to ask you a few questions.");
        System.out.println ("What's your name? ");
        name = keyboard.next();

        System.out.println ("Hi, " + name.toLowerCase() + ", it's good to meet you.");
        System.out.println ("Oops, did I forget to capitalize your name \n");
        System.out.println ("Hi, " + name.toUpperCase () + ", it's good to meet you.");
        System.out.println ("Wait, that's not right either. \n");
        System.out.println ("Hi, " + name + ", it's good to meet you \n");
        System.out.println ("Your name has " + name.length() + " letters in it.");

        System.out.println ("What's your favorite number?");
        favoriteNumber = keyboard.nextInt ();
        if (favoriteNumber > 100){
            System.out.println (favoriteNumber + " is a really big number!");

        }else{
            System.out.println ("Here is a bar " + favoriteNumber + " x's long.");
            for(int counter = 0; counter < favoriteNumber; counter++)
                (
                    System.out.println("x");
                )
            System.out.println (" ");
            System.out.println ("I hope it made you smile!");
        }
    }

}
