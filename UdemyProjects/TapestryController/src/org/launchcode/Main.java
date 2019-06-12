package org.launchcode;

public class Main {
    public static void main(String[] args) {

        Pattern[] patternList = new Pattern[] {
                new CrossStitchWigglePattern(),
                new ZigZagLinesPattern(),
                new BaublePattern(),
                new BlockyBaublePattern(),
        };

        for (int k = 0; k < patternList.length; k++) {
            for (int j = 0; j < 3; j++) {
                for (int i = 0; i < 8; i++) {
                    patternList[k].pattern();
                }
                System.out.println();
            }

            System.out.println("\n\n");

            for (int j = 0; j < 8; j++) {
                for (int i = 0; i < 6; i++) {
                    patternList[k].pattern();
                }
                System.out.println();
            }

            System.out.println("\n\n");
        }
    }
}
