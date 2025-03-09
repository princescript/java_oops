package jon.companyname.corejava.Math;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        //factorial
        // 1 * 2 * 3 * 4 * 5
        System.out.print("Enter number.");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //System.out.println(factorial(n));
        System.out.println(sumofNaturalNumber(n));
    }

    public static int factorial(int n) {
        //5! = 5 * 4!
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int sumofNaturalNumber(int n) {
        // 5 + 4 + 3 + 2 + 1
        if (n == 1) {
            return 1;
        }
        return n + sumofNaturalNumber((n - 1));
    }


}