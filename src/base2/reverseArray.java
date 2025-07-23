package base2;

import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] nums=new int[n];
        for (int i = 0; i < n; i++) {
            nums[i]=scan.nextInt();
        }
        rev(nums,0,nums.length-1);
        for(int num:nums){
            System.out.println(num+" ");
        }
    }
    static void rev(int[] arr,int start,int end){
        if(start>=end){
            return;
        }
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        rev(arr,start+1,end-1);
    }
}
