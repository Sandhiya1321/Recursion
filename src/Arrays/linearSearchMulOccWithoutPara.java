package Arrays;

import java.util.ArrayList;
//it is not an optimized way
public class linearSearchMulOccWithoutPara {
    //return the list but don't take the list in argument
    public static void main(String[] args) {
        int[] arr={1,23,32,34,56,34};
        System.out.println(search(arr,34,0));

    }
    static ArrayList<Integer> search(int[] arr,int target,int index){
        ArrayList<Integer> list=new ArrayList<>();
        if(index==arr.length){
            return list;
        }
        //this will contain answer for that function call only
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> ansFromAbove=search(arr,target,index+1);
        list.addAll(ansFromAbove);
        return list;
    }

}