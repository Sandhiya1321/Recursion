package Arrays;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr={4,3,5,2,1};
        System.out.println(Arrays.toString(merge(arr)));
    }
    static int[] merge(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int[] left=merge(Arrays.copyOfRange(arr,0,mid));
        int[] right=merge(Arrays.copyOfRange(arr,mid,arr.length));
        return merging(left,right);
    }

    private static int[] merging(int[] first, int[] second) {
        int[] mer=new int[first.length+second.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<first.length&&j<second.length){
            if(first[i]<second[j]){
                mer[k]=first[i];
                i++;
            }
            else{
                mer[k]=second[j];
                j++;
            }
            k++;
        }
        while(i<first.length){
            mer[k]=first[i];
            i++;
            k++;
        }
        while(j<second.length){
            mer[k]=second[j];
            j++;
            k++;
        }
        return mer;

    }
}

