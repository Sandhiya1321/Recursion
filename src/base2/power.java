package base2;

import java.util.Scanner;

public class power {
    public static int pow(int base, int exponent) {
        if (exponent == 0) return 1;

        return base * pow(base, exponent - 1);
    }

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int base=scan.nextInt();
        int expo=scan.nextInt();
        System.out.println(pow(base,expo));
    }

}
