/* Programmer : Paul Kumar
   Date       : 17/05/2022
   Topic      : WAP in JAVA to take Time in seconds as input from the user
                and convert in into Hours, Minutes and Seconds.
   IDE        : VS Code             */

import java.util.Scanner;

public class TimeCoversion {
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int sec, hr = 0, min = 0;

        System.out.printf("Enter the Time is seconds : ");
        sec = in.nextInt();

        if (sec >= 3600) {
            hr = sec / 3600;
            sec = sec % 3600;
        }
        if (sec >= 60) {
            min = sec / 60;
            sec = sec % 60;
        }
        System.out.print(hr + " Hours ");
        System.out.print(min + " Minutes ");
        System.out.println(sec + " Seconds");

        in.close();
    }
}
