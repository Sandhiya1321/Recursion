package Strings;

public class inplaceremchar {
    public static void main(String[] args) {
        String str="baabcchdk";
        System.out.println(rem(str));
    }
    static String rem(String up){
        if(up.isEmpty()){
            return"";
        }
        char ch=up.charAt(0);
        if(ch=='a'){
            return rem(up.substring(1));
        }else{
            return ch+rem(up.substring(1));
        }
    }
}
