package org.launchcode;
import java.util.Scanner;


public class GroceryList {

    public static void main(String[] args) {
        Scanner write =  new Scanner(System.in);
        item ();
        many ();
        cost ();
        total ();


/*      System.out.println ("Please list three items on your grocery shopping list.");
        System.out.println ("Item 1?");
        String itemOne = write.next ();
        System.out.println ("Item 2?");
        String itemTwo = write.next();
        System.out.println ("Item 3?");
        String itemThree = write.next();

        System.out.println ("Please enter the quantity of each item.");
        System.out.println ("How many " + itemOne + "?");
        int itemAmountOne = write.nextInt ();
        System.out.println ("How many " + itemTwo + "?");
        int itemAmountTwo = write.nextInt();
        System.out.println ("How many " + itemThree + "?");
        int itemAmountThree = write.nextInt();



        System.out.println ("Now, please enter the price of each item.");
        System.out.println ("How much does one " + itemOne + " cost?");
        double costOne = write.nextDouble ();

        System.out.println ("How much does one " + itemTwo + " cost?");
        double costTwo = write.nextDouble ();

        System.out.println ("How much does one " + itemThree + " cost?");
        double costThree = write.nextDouble ();


        double total = (itemAmountOne * costOne) + (itemAmountTwo * costTwo) + (itemAmountThree * costThree);
        System.out.println ("Calculating your grocery bill.");
        System.out.println ("Your total cost is " + total + ".");
*/


    }
    public static void item(Scanner write ){

        System.out.println ("Please list three items on your grocery shopping list.");
        System.out.println ("Item 1?");
        String itemOne = write.next ();
        System.out.println ("Item 2?");
        String itemTwo = write.next();
        System.out.println ("Item 3?");
        String itemThree = write.next();

    }

    public static void many(Scanner write , String item){
        System.out.println ("Please enter the quantity of each item.");
        System.out.println ("How many " + itemOne + "?");
        int itemAmountOne = write.nextInt ();
        System.out.println ("How many " + itemTwo + "?");
        int itemAmountTwo = write.nextInt();
        System.out.println ("How many " + itemThree + "?");
        int itemAmountThree = write.nextInt();

    }

    public static void cost(Scanner write, String item){
        System.out.println ("Now, please enter the price of each item.");
        System.out.println ("How much does one " + itemOne + " cost?");
        double costOne = write.nextDouble ();

        System.out.println ("How much does one " + itemTwo + " cost?");
        double costTwo = write.nextDouble ();

        System.out.println ("How much does one " + itemThree + " cost?");
        double costThree = write.nextDouble ();

    }


    public static void total(double cost, int many){

        double total = (itemAmountOne * costOne) + (itemAmountTwo * costTwo) + (itemAmountThree * costThree);
        System.out.println ("Calculating your grocery bill.");
        System.out.println ("Your total cost is " + total + ".");
    }
}