package org.launchcode;

public class Main {



            public static void main(String[] args) {
                int temps[][]={
                        { 68 ,70 ,76 ,70 ,68 ,71 ,75 },
                        { 76 ,76 ,87 ,84 ,82 ,75 ,83 },
                        { 73 ,72 ,81 ,78 ,76 ,73 ,77 },
                        { 64 ,65 ,69 ,68 ,70 ,74 ,72 }
                };

                System.out.println ("Temperature Calculater");
                System.out.println ();
                String times[]={"7:00 am","3:00 pm","7:00 pm","3:00 am"};
                String days[]={"Sun", "Mon", "Tues", "Wed", "Thurs", "Fri", "Sat"};
                System.out.println("The data provided are:");

                for(int row=0; row<temps.length; row++){
                    System.out.println(times[row]);

                    for(int column=0; column<7; column++)
                    {

                        System.out.print(" "+temps[row][column]+" ");
                    }
                }
                System.out.println();
                System.out.println("Based on the data, the following are the average temperatures for the week.");
                System.out.println();
                System.out.println("Sun: "+(temps[0][0]+temps[1][0]+temps[2][0]+temps[3][0])/4);
                System.out.println("Mon: "+(temps[0][1]+temps[1][1]+temps[2][1]+temps[3][1])/4);
                System.out.println("Tues: "+(temps[0][2]+temps[1][2]+temps[2][2]+temps[3][2])/4);
                System.out.println("Wed: "+(temps[0][3]+temps[1][3]+temps[2][3]+temps[3][3])/4);
                System.out.println("Thu: "+(temps[0][4]+temps[1][4]+temps[2][4]+temps[3][4])/4);
                System.out.println("Fri: "+(temps[0][5]+temps[1][5]+temps[2][5]+temps[3][5])/4);
                System.out.println("Sat: "+(temps[0][6]+temps[1][6]+temps[2][6]+temps[3][6])/4);
                System.out.println();
                System.out.println("7 am: "+(temps[0][0]+temps[0][1]+temps[0][2]+temps[0][3]+temps[0][4]+temps[0][5]+temps[0][6])/7);
                System.out.println("3 pm: "+(temps[1][0]+temps[1][1]+temps[1][2]+temps[1][3]+temps[1][4]+temps[1][5]+temps[1][6])/7);
                System.out.println("7 pm: "+(temps[2][0]+temps[2][1]+temps[2][2]+temps[2][3]+temps[2][4]+temps[2][5]+temps[2][6])/7);
                System.out.println("3 am: "+(temps[3][0]+temps[3][1]+temps[3][2]+temps[3][3]+temps[3][4]+temps[3][5]+temps[3][6])/7);
                System.out.println();
                System.out.println("The final average temperature for the week was: ");
                System.out.println();
                System.out.println("Overall: "+(temps[0][0]+temps[0][1]+temps[0][2]+temps[0][3]+temps[0][3]+temps[0][4]+temps[0][5]+temps[0][6]+
                        temps[1][0]+temps[1][1]+temps[1][2]+temps[1][3]+temps[1][4]+temps[1][5]+temps[1][6]+
                        temps[2][0]+temps[2][1]+temps[2][2]+temps[2][3]+temps[2][4]+temps[2][5]+temps[2][6]+
                        temps[3][0]+temps[3][1]+temps[3][2]+temps[3][3]+temps[3][4]+temps[3][5]+temps[3][6])/28);
            }
        }

