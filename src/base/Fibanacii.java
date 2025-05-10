package base;

public class Fibanacii {
    public static void main(String[] args) {
        System.out.println(fiibo(10));
    }
    static int fiibo(int n){
        if(n<2){
            return n;
        }
        return fiibo(n-1)+fiibo(n-2);
    }
}
