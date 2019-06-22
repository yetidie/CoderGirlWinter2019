package org.launchcode;

public class Main {

    public static void main(String[] args) {

        System.out.println ( "Temperature Calculator" );
        System.out.println ( "The data provided are: " );


        int[][] temp = new int[4][7];
        temp[0][0] = 68;        temp[1][0] = 76;
        temp[0][1] = 70;        temp[1][1] = 76;
        temp[0][2] = 76;        temp[1][2] = 87;
        temp[0][3] = 70;        temp[1][3] = 84;
        temp[0][4] = 68;        temp[1][4] = 82;
        temp[0][5] = 71;        temp[1][5] = 75;
        temp[0][6] = 75;        temp[1][6] = 83;

        temp[2][0] = 73;        temp[3][0] = 64;
        temp[2][1] = 72;        temp[3][1] = 65;
        temp[2][2] = 81;        temp[3][2] = 69;
        temp[2][3] = 78;        temp[3][3] = 68;
        temp[2][4] = 76;        temp[3][4] = 70;
        temp[2][5] = 73;        temp[3][5] = 74;
        temp[2][6] = 77;        temp[3][6] = 72;


        String[] dayOfWeek = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        String[] timeOfDay = new String[]{"7:00 am", "3:00 pm", "7:00 pm", "3:00 am"};


        System.out.println ( dayOfWeek + " " );
        for (int row = 0; row < temp.length; row++) {

            System.out.println ( timeOfDay[row] );
            for (int column = 0; column < 7; column++) {

                System.out.print ( " " + temp[row][column] + " " );
            }
        }

        for (int row = 0; row < temp.length; row++) {

            System.out.println ( "The average " + dayOfWeek + " temperature is " + dayAverage ( temp ) );
        }
        System.out.println ( "The average " + timeOfDay + "temperature is " + timeAverage ( temp ) );
        System.out.println ( "The total average temperature is " + averageTotal ( temp ) );

    }


/*
    private static void averageTotalOne(int[][] temp, int row, int column) {
        int i;
        int j;
        for (i = 0 + 1; i < row; i++) {
            for (j = 0 + 1; j < column; j++) {

                System.out.print ( temp[i][j] + " " );
            }
            System.out.println ( " " );
        }

        System.out.println (averageTotal);
    }*/

    public static double averageTotal(int[][] temp) {
        int i;
        int j;
        double total = 0;
        for (i = 0; i < temp.length; i++) {

            for (j = 0; j < temp[i].length; j++) {
                total += temp[i][j];
            }
        }
        double totalAverage = total / 28;
        return totalAverage;
    }

    public static double timeAverage(int[][] temp) {
        int i;
        int j;
        double total = 0;
        for (j = 0; j < temp.length; j++) {

            for (i = 0; i < temp.length; i++) {
                total += temp[i][0];
            }
        }
        double average = total / 4;
        return average;

    }

    public static double dayAverage(int[][] temp) {
        int i;
        int j;

        double total = 0;
        double average = 0;
        for (j = 0; j < temp.length; j++) {
            for (i = 0; i < temp.length; i++) {
                total += temp[0][j];
            }
            average = total / 7;
            return average;
        }


        return average;
    }
}
