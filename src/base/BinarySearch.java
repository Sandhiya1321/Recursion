package base;
public class BinarySearch {
    public static void main(String[] args) {
        int[] num={12,24,56,77,57,842,57};
        int target=123;
        System.out.println(search(num,target,0,num.length-1));

    }
    static int search(int[] num,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(num[mid]==target){
            return mid;
        }
        if(target<num[mid]){
            return search(num,target,start,mid-1);
        }
        return search(num,target,mid+1,end);
    }
}
