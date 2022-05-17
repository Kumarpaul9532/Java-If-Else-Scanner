/* Programmer : Paul Kumar
   Date       : 14/05/2022
   Topic      : WAP in JAVA to accept a number from the user and
                check whether the number is one digit,two digit or three digit.
   IDE        : VS Code             */

import java.util.Scanner;

public class Digit {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n;

        System.out.print("Enter a number :");
        n = in.nextInt();

        if (n / 10 == 0)
            System.out.println(n + " is One digit number");
        else if (n / 100 == 0)
            System.out.println(n + " is Two digit number");
        else if (n / 1000 == 0)
            System.out.println(n + " is Three digit number");
        else
            System.out.println("Number is having more than three digit");

        in.close();
    }
}
