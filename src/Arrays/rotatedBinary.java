package Arrays;

public class rotatedBinary {
    public static void main(String[] args) {
        int[] arr={1,23,32,33,56,34};
        System.out.println(binary(arr,32,0,arr.length-1));
    }
    static int binary(int[] arr,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[start]<=arr[mid]){
            //first half
            if(target>=arr[start]&&target<=arr[mid]){
                return binary(arr,target,start,mid-1);
            }
            else{
                return binary(arr,target,mid+1,end);
            }
        }
        //second half
        if(target>=arr[mid]&&target<=arr[end]){
            return binary(arr,target,mid+1,end);
        }
        else
            return binary(arr,target,start,mid-1);
    }

}