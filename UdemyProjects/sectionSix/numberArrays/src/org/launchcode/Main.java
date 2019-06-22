package org.launchcode;

public class Main {

    public static void main(String[] args) {


            int[] weekOne = {65,68,72,83,73,66,85};
            String[] dayOne = {"Sunday","Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };


            int[] weekTwo = {86,87,85,78,79,78,80};
            String[] dayTwo = {"Sunday","Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };


            int high = 0;
            int highTwo = 0;
            int warm = 0;

            for(int index =0; index < weekOne.length; index++){
                high += weekOne[index];
            }

            for(int index =0; index < weekOne.length; index++){
                highTwo += weekTwo[index];
            }

            int average = high / (int)weekOne.length;
            int averageTwo = highTwo/ (int)weekTwo.length;

            System.out.println("The average daily high tempature for week one is " + average +".");
            System.out.println("The average daily high tempature for week two is " + averageTwo +".");
            System.out.println("In week 1, " + dayOne + " was warmest at " + weekOne + " degrees.");
            System.out.println("In week 2, " + dayTwo + " was warmest at " + weekTwo + " degrees.");


    }
}
