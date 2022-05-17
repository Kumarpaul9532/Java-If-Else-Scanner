/* Programmer : Paul Kumar
   Date       : 14/05/2022
   Topic      : WAP in JAVA to accept a number from the user
                and check whether the number is Even or odd.
   IDE        : VS Code             */

import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n;

        System.out.print("Enter a number : ");
        n = in.nextInt();

        if (n % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");

        in.close();
    }
}