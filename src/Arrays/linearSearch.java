package Arrays;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr={1,2,34,5,7,6,90};
        System.out.println(linear(arr,34,0));
        System.out.println(linear1(arr,34,0));
        System.out.println(fromlast(arr,34,arr.length-1));
    }
//method1
    static boolean linear(int[] arr, int target,int index) {
        if(index==arr.length){
            return false;
        }
        return arr[index]==target||linear(arr,target,index+1);
    }
    //method 2
    static int linear1(int[] arr, int target,int index) {
        if(index==-1){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }else {
            return linear1(arr, target, index + 1);
        }
    }
    //method 3
    static int fromlast(int[] arr, int target,int index) {
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }else {
            return fromlast(arr, target, index -1);
        }
    }
}
