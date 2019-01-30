import static java.lang.System.out;
import java.util.Scanner;


public class Main
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        out.println("What are some things on your grocery list?");

        String firstItem;
        out.print("Item 1:");
        firstItem = keyboard.nextLine();

        String secondItem;
        out.print("Item 2:");
        secondItem = keyboard.nextLine();

        String thirdItem;
        out.print("Item 3:");
        thirdItem = keyboard.nextLine();

        out.println("Now please enter the quantity of each item.");

        int firstQuantity;
        out.print("How many " + firstItem +"s?");
        firstQuantity = keyboard.nextInt();
        keyboard.skip("\n");

        int secondQuantity;
        out.print("How many " + secondItem +"s?");
        secondQuantity = keyboard.nextInt();
        keyboard.skip("\n");

        int thirdQuantity;
        out.print("How many "+ thirdItem +"s?");
        thirdQuantity = keyboard.nextInt();
        keyboard.skip("\n");

        out.println("What is the price of each item?");

        float firstPrice;
        out.print("How much is one " + firstItem + "?");
        firstPrice = keyboard.nextFloat();
        keyboard.skip("\n");

        float secondPrice;
        out.print("How much is one " + secondItem + "?");
        secondPrice = keyboard.nextFloat();
        keyboard.skip("\n");

        float thirdPrice;
        out.print("How much for one " + thirdItem + "?");
        thirdPrice = keyboard.nextFloat();
        keyboard.skip("\n");


        float firstTotal = firstQuantity * firstPrice;
        float secondTotal =  secondQuantity * secondPrice;
        float thirdTotal =  thirdQuantity * thirdPrice;
        float grandTotal= firstTotal + secondTotal + thirdTotal;

        out.println("The total amount for " + firstQuantity + " " + firstItem + ", " + secondQuantity + " "+
                secondItem + ", and " + thirdQuantity + " " + thirdItem + " total will be $" + grandTotal +".");



    }

}
