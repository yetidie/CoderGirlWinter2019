package org.launchcode;




    public class Main {

        public static void main(String[] args) {


            int count = 0;

            do{
                count++;

                if ((count % 5 == 0) && (count % 3 == 0)){
                    System.out.println ("fizzbuzz");
                }
                else if (count % 3 == 0){
                    System.out.println ("fizz" );
                }
                else if (count % 5 == 0){
                    System.out.println ("buzz");

                }
                else{
                    System.out.println (count);
                }
            }while(count < 100);


        }

    }


