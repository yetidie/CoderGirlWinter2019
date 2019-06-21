package org.launchcode;

public class ZigZagLinesPattern extends Pattern {


    public void pattern() {

        ZigZagStitch zzs = new ZigZagStitch ();
        FillStitch fs = new FillStitch ();


            for (int i = 0; i < 2; i++) {
                zzs.sew ();
                zzs.sew ();
                zzs.sew ();
                fs.sew ();
                fs.sew ();
                fs.sew();

            }

    }
        }
