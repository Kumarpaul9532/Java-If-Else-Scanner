/* Programmer : Paul Kumar
   Date       : 17/05/2022
   Topic      : WAP in JAVA to take five numbers as input from the user
                and print smallest of them.
   IDE        : VS Code             */

import java.util.Scanner;

public class SmallestOf5 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        float a, b, c, d, e;

        System.out.print("Enter five numbers : ");
        a = in.nextFloat();
        b = in.nextFloat();
        c = in.nextFloat();
        d = in.nextFloat();
        e = in.nextFloat();

        if (a < b && a < c && a < d && a < e)
            System.out.println(a + " is smallest");
        else if (b < c && b < d && b < e)
            System.out.println(b + " is smallest");
        else if (c < d && c < e)
            System.out.println(c + " is smallest");
        else if (d < e)
            System.out.println(d + " is smallest");
        else
            System.out.println(e + " is smallest");

        in.close();
    }
}
