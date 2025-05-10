package base;

public class fiboFormula {
    public static void main(String[] args) {
//        for (int i = 1; i < 10; i++) {
//            System.out.println(Fibo(i));
//        }
        System.out.println(Fiboformula(10));
    }
    static int Fiboformula(int n){
        return (int) ((int)(Math.pow((1 + (Math.sqrt(5)) / 2), n) )/ (Math.sqrt(5)));
    }
}

