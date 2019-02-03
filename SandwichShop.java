package org.launchcode;
import static java.lang.System.out;
import java.util.Scanner;


public class SandwichShop
{

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        int goalForVeggies = 50;
        int goalForBurgers = 250;
        int goalForSubs = 180;
        int goalForSoup = 70;


        out.println("The sales goal for veggie sandwiches is 50.");
        out.println("How many veggie sandwiches have you sold today?");
        int veggieSandwich = keyboard.nextInt();
        keyboard.skip("\n");

            if (veggieSandwich >= goalForVeggies)
            {
                out.println("Meets goal");
            }
            else
            {
                out.println("Fell short");
            }



        out.println("The sales goal for burgers is 250.");
        out.println("How many burgers were sold today?");
        int burgers = keyboard.nextInt();
        keyboard.skip("\n");

            if (burgers >= goalForBurgers)
            {
                out.println("Meets goal");
            }
            else
            {
                out.println("Fell short");
            }

        out.println("The sales goal for subs is 180.");
        out.println("How many subs were sold today?");
        int subs = keyboard.nextInt();
        keyboard.skip("\n");

            if (subs >= goalForSubs)
            {
               out.println("Meets goal");
            } else
            {
                out.println("Fell short");
            }


        out.println("The sales goal for soup is 70.");
        out.println("How many soups were sold today?");
        int soup = keyboard.nextInt();
        keyboard.skip("\n");

            if (soup >= goalForSoup)
            {
                out.println("Meets goal");
            } else
            {
              out.println("Fell short");
            }

        if((veggieSandwich >= goalForVeggies) && (burgers >= goalForBurgers) && (subs >= goalForSubs) && (soup >= goalForSoup))
        {
            out.println("Made goal for everything!");
        }

    }
}
