package org.launchcode;

public class BaublePattern extends Pattern {
    public void baublePattern(){
        ShortlLineStitch sl = new ShortlLineStitch ();
        CircleStitch cs = new CircleStitch ();

        System.out.println (sl);
        System.out.println (sl);
        System.out.println (cs);
    }
}
