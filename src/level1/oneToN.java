package level1;

public class oneToN {
    public static void main(String[] args) {
        func(7);
    }
    static void func(int n){
        if(n==0){
            return;
        }
        func(n-1);
        System.out.println(n);
    }
}
