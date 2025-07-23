package base2;

import java.util.Scanner;

public class smallest {
    static int smallest(int[] nums,int index,int min){
        if(index==nums.length){
            return min;
        }
        if(nums[index]<min){
            min= nums[index];

        }
        return smallest(nums,index+1,min);
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] nums=new int[n];
        for (int i = 0; i < n; i++) {
            nums[i]=scan.nextInt();
        }
        System.out.println(smallest(nums,0,nums[0]));
    }
}
