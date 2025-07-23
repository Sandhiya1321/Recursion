package base2;

import java.util.Scanner;

public class hcf {
    public static int hcf(int a, int b) {
        if (b == 0) {
            return a;
        }
        return hcf(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println(hcf(num1, num2));
    }
}
