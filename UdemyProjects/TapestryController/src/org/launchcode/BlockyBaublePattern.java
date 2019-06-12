package org.launchcode;

public class BlockyBaublePattern extends Pattern{
    public void BlockyBauble(){
        BlockStitch bs = new BlockStitch ();
        FillStitch fs = new FillStitch ();
        //FillStitch();
        CircleStitch cs = new CircleStitch();
        for (int s = 0; s < 3; s++) {
            for (int i = 0; i < 3; i++) {
                System.out.println (bs);
            }
            for (int i = 0; i < 3; i++) {
                System.out.println (fs);
                System.out.println (fs);
            }
            for (int i = 0; i < 3; i++) {
                System.out.println (cs);
            }
        }
    }
}
