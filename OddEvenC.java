/* Programmer : Paul Kumar
   Date       : 17/05/2022
   Topic      : WAP in JAVA to accept a number from the user and
                check whether the number is Even or Odd (Using Conditional Operator).
   IDE        : VS Code             */

import java.util.Scanner;

public class OddEvenC {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n;
        String str;

        System.out.print("Enter a number : ");
        n = in.nextInt();

        str = (n % 2 == 0) ? "Even" : "Odd";
        System.out.println(str);

        in.close();
    }
}
