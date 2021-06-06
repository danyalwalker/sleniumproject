package com.cybertek.Utilities;

public class BrowserUtils {
   /*
   Method will accept in wait for given second duration
    */
    public static void sleep(int second) {
        //1 sec = 1000 milli second
        //1*1000 = 1000
        second*=1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
