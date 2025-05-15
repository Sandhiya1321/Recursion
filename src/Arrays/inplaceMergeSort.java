package Arrays;

import java.util.Arrays;

public class inplaceMergeSort {
    public static void main(String[] args) {
        int[] arr={4,3,5,2,1};
        sort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr,int s,int e){
        if(e-s<=1){
            return;
        }
        int mid=s+(e-s)/2;
        sort(arr,s,mid);
        sort(arr,mid,e);
        merging(arr,s,mid,e);
    }
    static void merging(int[] arr,int s,int m,int e){
        int[] merge=new int[e-s];
        int i=s;
        int j=m;
        int k=0;
        while(i<m&&j<e){
            if(arr[i]<arr[j]){
                merge[k]=arr[i];
                i++;
            }else{
                merge[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<m){
            merge[k]=arr[i];
            i++;
            k++;
        }
        while(j<e){
            merge[k]=arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < merge.length; l++) {
            arr[s+l]=merge[l];
        }
        //optimized
        //System.arraycopy(mix,0,arr,s+0,mix.length);
    }
}
