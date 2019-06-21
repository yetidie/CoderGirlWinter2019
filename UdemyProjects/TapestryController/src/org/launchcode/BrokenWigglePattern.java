package org.launchcode;

public class BrokenWigglePattern extends Pattern {
    public void pattern() {

        SmallCrossStitch scs = new SmallCrossStitch ();
        LargeCrossStitch lcs = new LargeCrossStitch ();

        boolean needleJam = (Math.random () < 0.4d);
        if (needleJam) {
            for (int i = 0; i < 4; i++) {
                scs.sew ();
                lcs.sew ();

            }
        } else {
            for (int i = 0; i < 5; i++) {
                scs.sew ();
                lcs.sew ();
            }
        }
    }
}
