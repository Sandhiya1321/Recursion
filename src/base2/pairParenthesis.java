package base2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pairParenthesis {
    static void paren(int n, int open, int close, String current, List<String> res){
        if(open==n&&close==n){
            res.add(current);
            return;
        }
        if(open<n){
            paren(n,open+1,close,current+"(",res);
        }
        if(close<open){
            paren(n,open,close+1,current+")",res);
        }
    }
    static List<String> parenReturn(int n){
        List<String> out=new ArrayList<>();
        paren(n,0,0,"",out);
        return out;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        System.out.println(parenReturn(n));
    }
}
