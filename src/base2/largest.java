package base2;

import java.util.Scanner;

public class largest {
    public static int findLargest(int[] arr, int index, int max) {
        if (index == arr.length) return max;

        if (arr[index] > max) {
            max = arr[index];
        }

        return findLargest(arr, index + 1, max);
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=scan.nextInt();
        }
        System.out.println(findLargest(arr,0,arr[0]));
    }

}
