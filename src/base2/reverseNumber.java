package base2;

import java.util.Scanner;

public class reverseNumber {
    public static int reverse(int num, int rev) {
        if (num == 0) {
            return rev;
        }
        return reverse(num / 10, rev * 10 + num % 10);
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number=scan.nextInt();
        System.out.println(reverse(number,0));
    }
}
