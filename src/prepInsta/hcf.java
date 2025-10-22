package prepInsta;

public class hcf {
    public static int ans(int num1,int num2){
        if(num1==0) return num2;
        if(num2==0) return num1;
        if(num1==num2) return num2;
        if(num1>num2) {
            return ans(num1-num2,num2);
        }
        return ans(num1,num2-num1);
    }

    public static void main(String[] args) {
        System.out.println(ans(10,0));
    }
}
