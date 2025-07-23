package base2;

import java.util.Scanner;

public class lengthString {
    public static int length(String str) {
        if (str.equals("")) {
            return 0;
        }
        return 1 + length(str.substring(1));
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        System.out.println(length(str));
    }
}
