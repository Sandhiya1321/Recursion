package base2;

import java.util.Scanner;

public class remDup {
        public static String removeDup(String s) {
            if (s.length() <= 1) {
                return s;
            }

            if (s.charAt(0) == s.charAt(1)) {
                int i = 0;
                while (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                    i++;
                }
                return removeDup(s.substring(i + 1));
            } else {

                return s.charAt(0) + removeDup(s.substring(1));
            }
        }

        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            String str = scan.next();
            System.out.println(removeDup(str));
        }
}
