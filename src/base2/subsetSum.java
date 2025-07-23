package base2;

import java.util.Scanner;

public class subsetSum {
    public static void findSubset(int[] arr, int index, int sum) {
        if (index == arr.length) {
            System.out.println(sum);
            return;
        }

        findSubset(arr, index + 1, sum + arr[index]);

        findSubset(arr, index + 1, sum);
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] nums=new int[n];
        for (int i = 0; i < n; i++) {
            nums[i]=scan.nextInt();
        }
        findSubset(nums, 0, 0);
    }
}
