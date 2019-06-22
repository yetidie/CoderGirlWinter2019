package org.launchcode;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner number = new Scanner(System.in);

        System.out.println ("Pirate Lady Ching wants to build some locking treasure chests. \n" +
                "The chests are a standard size to fit in the ships cargo area. Every chest \n" +
                "requires 9 boards. \n ");
        System.out.println ("What is today's price for boards, in silver pieces?");
        int boardNumber = number.nextInt();
        number.skip("\n");



        System.out.println ("The cost per chest is " + boardNumber * 9 + " silver pieces for boards.");

        System.out.println ("Each chest also requires lock hardware.\n" +
                "What is today's price for locks, in silver pieces?\n");
        int lockNumber = number.nextInt();
        number.skip("\n");


        System.out.println ("How many silver pieces does lady Ching wish to invest in the building of chests?");
        int silverAmount = number.nextInt ();
        number.skip("\n");

        int totalCost = (boardNumber * 9) + lockNumber;
        int totalChest = silverAmount % totalCost ;
        int leftBehind = silverAmount - (totalCost * totalChest);

        System.out.println ("That will pay for the creation of " + totalChest + " chests.");

        System.out.println ("Left over silver pieces: " + leftBehind );
    }
}
