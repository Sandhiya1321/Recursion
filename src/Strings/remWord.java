package Strings;

public class remWord {
    public static void main(String[] args) {
        String str="bdfapplefghjktrfg";
        System.out.println(remove(str));
    }
    static String remove(String up){
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("apple")){
            return remove(up.substring(5));
        }
        else{
            return up.charAt(0)+remove(up.substring(1));
        }
    }
}
