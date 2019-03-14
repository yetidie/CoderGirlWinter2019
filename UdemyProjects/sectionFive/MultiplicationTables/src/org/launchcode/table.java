package org.launchcode;
import java.util.Scanner;

public class table {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner ( System.in );

        System.out.println ("Can I have a number? (No larger than 20)");
        int number = keyboard.nextInt();
        int count = 0;
        int numberAlso = 0;


        for(count = 0; count <= number; count ++){


            for(numberAlso = 0; numberAlso <= number; numberAlso ++){

                int solution = numberAlso * count;
                System.out.println ( count + " x " + numberAlso + " = " + solution );

            }




        }


}
}
