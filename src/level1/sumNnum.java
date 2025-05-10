package level1;
//special pattern to return same value to above calls
public class sumNnum {
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
    static int sum(int n){
        if(n<=1){
            return 1;
        }
        return n+sum(n-1);
    }
}
