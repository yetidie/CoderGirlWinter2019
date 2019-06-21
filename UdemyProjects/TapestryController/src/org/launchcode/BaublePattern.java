package org.launchcode;


public class BaublePattern extends Pattern {
    public void pattern() {
        Stitch sls = new ShortlLineStitch ();
        Stitch cs = new CircleStitch ();


            for (int i = 0; i < 5; i++) {
                sls.sew ();
                sls.sew ();
                cs.sew ();


            }

    }

    }

