package Strings;

public class skipUnRequired {
    public static void main(String[] args) {
        String str="babdbapplejappha";
        System.out.println(skip(str));
    }
    static String skip(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("app")&&!up.startsWith("apple")){
            return skip(up.substring(3));
        }
        else{
            return up.charAt(0)+skip(up.substring(1));
        }
    }
}
