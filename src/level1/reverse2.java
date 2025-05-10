package level1;

public class reverse2 {
    public static void main(String[] args) {
        System.out.println(rev(1234));
    }
    static int rev(int n){
        int digits=(int)(Math.log10(n))+1;
        return helpfunc(n,digits);
    }

    private static int helpfunc(int n, int digits) {
        if(n==0){
            return n;
        }
        int rem=n%10;
        return rem*(int)(Math.pow(10,digits-1))+helpfunc(n/10,digits-1);
    }
}
