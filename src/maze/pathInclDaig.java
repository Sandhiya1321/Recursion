package maze;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class pathInclDaig {
    public static void main(String[] args) {
        System.out.println(diagonalReturn("",3,3));
        diagonal("",3,3);
    }
    static void diagonal(String p,int r,int c){
        if(r==1&&c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            diagonal(p+'V',r-1,c);
        }
        if(r>1&&c>1){
           diagonalReturn(p+'D',r-1,c-1);
        }
        if(c>1){
            diagonal(p+'H',r,c-1);
        }
    }
    static ArrayList<String> diagonalReturn(String p,int r,int c){
        if(r==1&&c==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans=new ArrayList<>();

        if(r>1){
            ans.addAll(diagonalReturn(p+'V',r-1,c));
        }
        if(r>1&&c>1){
            ans.addAll(diagonalReturn(p+'D',r-1,c-1));
        }
        if(c>1){
            ans.addAll(diagonalReturn(p+'H',r,c-1));
        }
        return ans;
    }
}
