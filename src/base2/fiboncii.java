package base2;

import java.util.Scanner;

public class fiboncii {
    static int fibo(int num){
        if(num<2){
            return num;
        }
        return fibo(num-1)+fibo(num-2);
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        System.out.println(fibo(num));
    }
}
