package org.launchcode;

public class BlockyBaublePattern extends Pattern
{
    private Stitch bs = new BlockStitch();
    private Stitch sls = new ShortlLineStitch ();
    private Stitch cs = new CircleStitch();

    public void pattern(){
        boolean needleJam = (Math.random() < 0.1d);
        if (needleJam){
            for (int i = 0; i < 2; i++) {
                bs.sew();
                sls.sew();
                sls.sew();
                cs.sew();
                sls.sew();
                sls.sew();
            }
        } else {
            for (int i = 0; i < 3; i++) {
                bs.sew();
                sls.sew();
                sls.sew();
                cs.sew();
                sls.sew();
                sls.sew();
            }
        }
    }


}
