package org.launchcode;


public class Main {

    public static void main(String[] args) {



        char[] number ={110, 101, 102, 103, 104, 105, 106, 107, 110, 111, 112,
        113, 114, 115, 116, 117, 120, 121, 122, 123, 124, 125, 126, 127, 130, 131, 132, 133, 134};
        char[] letters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
        'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U',
        'V', 'W', 'X', 'Y', 'Z', ' ', '.', '?'};

        char[] merge = new char[number.length + letters.length];

        //number[] = letters[];





            int nums[] = { 114, 104, 104, 123, 68, 100, 123, 68,
            123, 107, 104, 68, 123, 107, 104, 100, 123, 104, 121,
            68, 100, 123, 68, 115, 110, 115, 104, 68, 117, 114, 69};

            for (int index = 0; index < nums.length; index++)
            {
                char letter = (char) merge[index];
                System.out.print(letter);
            }
            System.out.println();

    }
}
