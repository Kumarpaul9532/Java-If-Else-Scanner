/* Programmer : Paul Kumar
   Date       : 14/05/2022
   Topic      : WAP in JAVA to accept three numbers from the user
                and print the largest number among them.
   IDE        : VS Code             */

import java.util.Scanner;

public class Largest {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        float a, b, c;

        System.out.print("Enter three numbers : ");
        a = in.nextFloat();
        b = in.nextFloat();
        c = in.nextFloat();

        if (a > b && a > c)
            System.out.println(a + " is largest");
        else if (b > c)
            System.out.println(b + " is largest");
        else
            System.out.println(c + " is largest");

        in.close();
    }
}
