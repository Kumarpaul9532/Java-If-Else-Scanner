/* Programmer : Paul Kumar
   Date       : 17/05/2022
   Topic      : WAP in JAVA to accept a three numbers from the user and
                Print the second largest/second smallest number
                (Without using if else & Conditional Operator).
   IDE        : VS Code             */

import java.util.Scanner;

public class SecondLargest2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        float a, b, c, max, min, sl;

        System.out.print("Enter three numbers : ");
        a = (in.nextInt());
        b = (in.nextInt());
        c = (in.nextInt());

        max = Math.max(a, Math.max(c, b));
        min = Math.min(a, Math.min(c, b));
        sl = (a + b + c) - (max + min);

        System.out.println("Second largest number is " + sl);
        in.close();
    }

}
