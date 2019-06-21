package org.launchcode;


public class BaublePattern extends Pattern {
    public void baublePattern() {
        Stitch sls = new ShortlLineStitch ();
        Stitch cs = new CircleStitch ();

        //public void patterns(){
            for (int i = 0; i < 5; i++) {
                sls.sew ();
                sls.sew ();
                cs.sew ();


            }
        //}
    }

    }

