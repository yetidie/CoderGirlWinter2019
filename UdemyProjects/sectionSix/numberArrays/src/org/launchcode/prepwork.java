package org.launchcode;
import java.util.Scanner;
public class prepwork {

    public static void main(String[] args){

        Scanner nope = new Scanner(System.in);
        int[] numbers = new int[5];

        //nope.skip("\n");

        for(int index = 0 ; index < numbers.length ; index++) {
            System.out.print ( "Give me a number.");
            numbers[index] =  nope.nextInt();
        }

        int high = numbers[0];
for(int index = 1; index < numbers.length; index++){
            if(numbers[index] > high){
                high =  numbers[index];
            }
        }


        //for(int index = 0; index > numbers.length; ){
         //   System.out.println(index);
        //}

        sout
    }
    //public
}
