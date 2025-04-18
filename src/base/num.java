package base;

public class num {
    public static void main(String[] args) {
    print(1);
    }
    static void print(int n){
       if(n==100){
           System.out.println(100);
           return;
       }
        System.out.println(n);
        print(n+1);
    }
}
