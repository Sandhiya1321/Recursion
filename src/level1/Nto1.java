package level1;

public class Nto1 {
    public static void main(String[] args) {
        func(7);
    }
    static void func(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        func(n-1);
    }
}
