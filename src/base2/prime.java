package base2;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        System.out.println(prime(n));
    }


    public static boolean isPrime(int n, int divisor) {
        if (n < 2) return false;
        if (divisor * divisor > n) return true;
        if (n % divisor == 0) return false;

        return isPrime(n, divisor + 1);
    }

    public static boolean prime(int n) {
        return isPrime(n, 2);
    }

}
