package org.launchcode;

public class ZigZagLinesPattern extends Pattern {
    private Object ZigZagStitch;

    public void zigZagLine(){

        ZigZagStitch z = new ZigZagStitch();
        FillStitch f = new FillStitch();

        for (int s = 0; s < 2; s++) {
            for (int i = 0; i < 3; i++) {
                System.out.println (z);
            }
            for (int i = 0; i < 3; i++) {
                System.out.println (f);
            }
        }
    }
}
