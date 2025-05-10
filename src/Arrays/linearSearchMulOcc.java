package Arrays;

import java.util.ArrayList;

public class linearSearchMulOcc {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,3,34,45,34,2};
        findallIndex(arr,34,0);
        //method 1  to print ans
        System.out.println(list);
        //method 2 to print ans
        System.out.println(findallIndex1(arr,34,0,new ArrayList<>()));
        //method 3 to print ans
        ArrayList<Integer> ans=findallIndex1(arr,34,0,new ArrayList<>());
        System.out.println(ans);
        //method 4 to print ans
        ArrayList<Integer> list=new ArrayList<>();
        System.out.println(findallIndex1(arr,34,0,list));

    }
    //method 1
    static ArrayList<Integer> list=new ArrayList<>();
    static void findallIndex(int[] arr,int target,int index){
        if(index==arr.length){
            return;
        }
        if(arr[index]==target){
            list.add(index);
        }
        findallIndex(arr,target,index+1);
    }
    //method 2
    static ArrayList<Integer> findallIndex1(int[] arr,int target,int index,ArrayList<Integer> list){
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
       return findallIndex1(arr,target,index+1,list);
    }
}
