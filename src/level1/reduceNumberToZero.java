package level1;
//1342
public class reduceNumberToZero {
    public static void main(String[] args) {
        System.out.println(reduce(14));
    }
    static int reduce(int n){
        return helpfuns(n,0);
    }
    private static int helpfuns(int n, int step){
        if(n==0){
            return step;
        }
        if(n%2==0){
            return helpfuns(n/2,step+1);
        }
        return helpfuns(n-1,step+1);
    }
}
