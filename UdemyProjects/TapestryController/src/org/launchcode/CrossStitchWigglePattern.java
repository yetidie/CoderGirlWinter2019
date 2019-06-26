package org.launchcode;

public class CrossStitchWigglePattern extends Pattern {

    private Stitch scs = new SmallCrossStitch ();
    private Stitch lcs = new LargeCrossStitch ();


    public void pattern(){
       boolean needleJam = (Math.random() < 0.1d);
       if (needleJam){
           for (int i = 0; i < 4; i++) {
               scs.sew ();
               lcs.sew();
           }
        } else {
            for (int i = 0; i < 5; i++) {
                scs.sew ();
                lcs.sew();
            }
        }
    }


}

