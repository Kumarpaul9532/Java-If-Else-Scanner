/* Programmer : Paul Kumar
   Date       : 17/05/2022
   Topic      : WAP in JAVA to take Days as input from the user
                and convert in into a Years, Months and Days.
   IDE        : VS Code             */

import java.util.Scanner;

public class DaysConversion {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int day, year = 0, mon = 0;

        System.out.print("Enter the number of days : ");
        day = in.nextInt();

        year = day / 365;
        day = day % 365;

        if (day >= 30) {
            mon = day / 30;
            day = day % 30;
        }

        System.out.print(year + " Years ");
        System.out.print(mon + " Months ");
        System.out.println(day + " Days");

        in.close();
    }
}
