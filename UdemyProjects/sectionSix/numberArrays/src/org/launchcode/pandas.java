package org.launchcode;

import java.util.Scanner;

public class pandas {


        public static void main(String[] args){

            Scanner nope = new Scanner(System.in);
            String[] name = new String[3];

            for(int index = 0 ; index <name.length ; index) {
                System.out.print ( "Give me a name for a panda.");
                name[index] =  nope.nextLine();
            }

            //String high = name[0];
            int highLength = 0;
            int highIndex = 0;

            for(int j = 0; j < name.length;  j++){
                if (name[j].length() > highLength){

                    highIndex = j;
                    highLength = names[j].length();


                }
            }


            //for(int index = 0; index > numbers.length; ){
            //   System.out.println(index);
            //}



        }
        //public
    }


