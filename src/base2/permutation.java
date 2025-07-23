package base2;

import java.util.Scanner;

public class permutation {
    public static void permute(String str, String result,String original) {
        if (str.isEmpty()) {
            if(!result.equals(original)) {
                System.out.println(result);

            }
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i + 1);
            permute(remaining, result + ch,original);
        }
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        permute(str, "",str);
    }
}