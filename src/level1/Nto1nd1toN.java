package level1;

public class Nto1nd1toN {
    public static void main(String[] args) {
        funcboth(7);
    }
    static void funcboth(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        funcboth(n-1);
        System.out.println(n);
    }
}
