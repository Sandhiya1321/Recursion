package Strings;

import java.util.ArrayList;

public class diceRolls {
    public static void main(String[] args) {
        dice("",4);
        System.out.println(dice1("",4));
        diceFace("",4,7);
        System.out.println(dice1face("",4,7));
    }
    static void dice(String p,int target){
        if(target==0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <=6&&i<=target; i++) {
            dice(p+i,target-i);
        }
    }

    static ArrayList<String> dice1(String p, int target){
        if(target==0){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans=new ArrayList<>();
        for (int i = 1; i <=6&&i<=target; i++) {
           ans.addAll(dice1(p+i,target-i));
        }
        return ans;
    }
    static void diceFace(String p,int target,int face){
        if(target==0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <=face&&i<=target; i++) {
            diceFace(p+i,target-i,face);
        }
    }
    static ArrayList<String> dice1face(String p, int target,int face){
        if(target==0){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans=new ArrayList<>();
        for (int i = 1; i <=face&&i<=target; i++) {
            ans.addAll(dice1face(p+i,target-i,face));
        }
        return ans;
    }
}
