package Strings;

import java.util.ArrayList;

public class asciiValue {
    public static void main(String[] args) {
        String str="abc";
        subAscii("",str);
        System.out.println(subseqAscii("",str));
    }
    static void subAscii(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        subAscii(p+ch,up.substring(1));
        subAscii(p,up.substring(1));
        subAscii(p+(ch+0),up.substring(1));

    }
    static ArrayList<String> subseqAscii(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> one=subseqAscii(p+ch,up.substring(1));
        ArrayList<String> two=subseqAscii(p,up.substring(1));
        ArrayList<String> three=subseqAscii(p+(ch+0),up.substring(1));

        one.addAll(two);
        one.addAll(three);
        return one;
    }
}
