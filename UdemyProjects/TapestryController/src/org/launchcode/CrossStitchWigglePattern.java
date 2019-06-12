package org.launchcode;

public class CrossStitchWigglePattern extends Pattern {


    public void crossStitchWigglePattern() {

        SmallCrossStitch sc = new SmallCrossStitch ();
        LargeCrossStitch lc = new LargeCrossStitch ();

        for (int s = 0; s < 5; s++) {
            for (int i = 0; i < 1; i++) {
                System.out.println ( sc );

            }
            for (int i = 0; i < 1; i++) {
                System.out.println ( lc );
            }
        }
    }
}