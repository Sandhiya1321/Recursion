package base2;

import java.util.Scanner;

public class partitionPalindrome {
    static void partitionPal(String str,int start,String partition,String separate){
        if(start==str.length()){
            System.out.println(partition);
            return;
        }
        for (int i = start+1; i <= str.length(); i++) {
            String substring=str.substring(start,i);
            if(ispalin(substring)){
                partitionPal(str,i,partition+separate+substring," ");
            }
        }
    }
    static boolean ispalin(String s){
        int start=0;
        int end=s.length()-1;
        while(start<end){
            if(s.charAt(start++)!=s.charAt(end--)){
                return false;
            }
        }
        return true;
    }
    static void print(String s){
        partitionPal(s,0,"","");
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        print(str);

    }
}
