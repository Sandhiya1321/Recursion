package Strings;

public class remChar {
    public static void main(String[] args) {
        String str="bccadaah";
        rem("",str);
    }
    static void rem(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        if(ch=='a'){
            rem(p,up.substring(1));
        }else{
            rem(p+ch,up.substring(1));
        }
    }
}
