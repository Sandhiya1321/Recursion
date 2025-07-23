package base2;

import java.util.Scanner;

public class NbitBinaryNum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        print(n);
    }
    static void print(int n){
        binary(n,0,0,"");
    }
    static void binary(int n,int one,int zero,String current){
        if(current.length()==n){
            System.out.println(current);
            return;
        }
        binary(n,one+1,zero,current+"1");
        if(one>zero){
            binary(n,one,zero+1,current+"0");
        }
    }
}
