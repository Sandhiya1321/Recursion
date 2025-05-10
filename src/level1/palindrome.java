package level1;
public class palindrome {
    public static void main(String[] args) {
        System.out.println(palin(1234321));
    }
    static boolean palin(int n){
        return n==rev(n);
    }
    static int rev(int n){
        int digits= (int) Math.log10(n)+1;
        return helpfun(n,digits);
    }

    private static int helpfun(int n, int digits) {
        if(n%10==n){
            return n;
        }
        int rem=n%10;
        return  rem*(int)(Math.pow(10,digits-1))+helpfun(n/10,digits-1);
    }
}
