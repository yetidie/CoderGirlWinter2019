package org.launchcode;

public class methods {
    public static void main(String[ ] args)
    {
        String[ ][ ] animals = {
                { "DanaDog", "WallyDog", "JessieDog", "AlexisDog", "LuckyDog" },
                { "BibsCat", "DoodleCat", "MillieCat", "SimonCat" },
                { "ElyFish", "CloieFish", "GoldieFish", "OscarFish", "ZippyFish",
                        "TedFish"},
                { "RascalMule", "GeorgeMule", "GracieMule", "MontyMule",
                        "BuckMule", "RosieMule" }
        };

        for (int i = 0; i < animals.length; i++)
        {
            System.out.print(animals[ i ] [ 0 ] + ": ");
            for (int j = 1; j < animals[ i ].length; j++)
            {
                System.out.print(animals[ i ][ j ] + " ");
            }
            System.out.println( );
        }
    }
}


    public int averageTotal(int[][] temp) {
        int i;
        int total = 0;
        for(i =0; i < temp.length; i ++){
     //       total += temp[i];
        }
        int average = total / temp.length;
        return average;
    }
}

