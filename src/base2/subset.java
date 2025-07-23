package base2;

import java.util.Scanner;

public class subset {
    public static void findSubsets(int[] arr, int index, String subset) {
        if (index == arr.length) {
            System.out.println("{" + subset + "}");
            return;
        }
        findSubsets(arr, index + 1, subset + arr[index]);


        findSubsets(arr, index + 1, subset);
    }

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=scan.nextInt();
        }
        findSubsets(arr, 0, "");
    }
}
