/* Programmer : Paul Kumar
   Date       : 17/05/2022
   Topic      : WAP in JAVA to accept a three numbers from the user and
                Print the second largest/second smallest number (Using Coditonal Operator).
   IDE        : VS Code             */

import java.util.Scanner;

public class SecondLargest {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        float a, b, c, max, min, sl;

        System.out.print("Enter three numbers : ");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        max = (a > b && a > c) ? a : (b > c) ? b : c;
        min = (a < b && a < c) ? a : (b < c) ? b : c;
        sl = (a + b + c) - (max + min);

        System.out.println("Second Largest number is " + sl);
        in.close();
    }
}
