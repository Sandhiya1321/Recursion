package prepInsta;

public class powNum {
    public static int pow(int n,int x){
        if(x==0) return 1;
        return n*pow(n,x-1);
    }

    public static void main(String[] args) {
        int n=6,x=3;
        System.out.println(pow(n,x));
    }
}
