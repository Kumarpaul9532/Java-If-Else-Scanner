/* Programmer : Paul Kumar
   Date       : 14/05/2022
   Topic      : WAP in JAVA to accept a number from the user
                and check whether the number is Buzz number or not.
   IDE        : VS Code             */

import java.util.Scanner;

public class Buzz {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n;

        System.out.print("Enter a number : ");
        n = in.nextInt();

        if (n % 7 == 0 || n % 10 == 7)
            System.out.println("Buzz Number");
        else
            System.out.println("Not a Buzz Number");

        in.close();
    }
}
