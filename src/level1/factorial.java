package level1;

public class factorial  {
    public static void main(String[] args) {
        int ans=prod(5);
        System.out.println(ans);
    }
    static int prod(int n){
        if(n<=1){
           return 1;
        }

        return  n*prod(n-1);
    }
}
