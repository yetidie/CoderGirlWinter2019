package org.launchcode;

public class BaublePattern extends Pattern {
    public void baublePattern(){
        ShortlLineStitch sl = new ShortlLineStitch ();
        CircleStitch cs = new CircleStitch ();

        for (int s = 0; s < 5; s++) {
            for (int i = 0; i < 2; i++) {
                System.out.println (sl);
                System.out.println (sl);
            }
            for (int i = 0; i < 1; i++) {
                System.out.println (cs);
            }
        }

    }
}
