/* Programmer : Paul Kumar
   Date       : 14/05/2022
   Topic      : WAP in JAVA to accept a number from the user and
                check whether the number is Positive,Negative or Non-negative.
   IDE        : VS Code             */

import java.util.Scanner;

public class PosNeg {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        float n;

        System.out.print("Enter a number : ");
        n = in.nextFloat();

        if (n > 0)
            System.out.println("Positive Number");
        else if (n < 0)
            System.out.println("Negative number");
        else
            System.out.println("Non-negative number");

        in.close();
    }
}
