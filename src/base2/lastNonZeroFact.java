package base2;

import java.util.Scanner;

public class lastNonZeroFact {
    public static int fact(int n) {
        if (n == 1) {
            return 1;
        }

        int num = n;

        while (num % 10 == 0) {
            num /= 10;
        }

        int small = fact(n - 1);
        int result = (small * (num % 10));

        while (result % 10 == 0) {
            result /= 10;
        }

        return result % 10;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        System.out.println(fact(n));
    }
}