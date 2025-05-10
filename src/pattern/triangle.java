package pattern;

public class triangle {
    public static void main(String[] args) {
        trian(4,0);
    }
    static void trian(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            trian(r,c+1);
            System.out.print("*");
        }else{
            trian(r-1,0);
            System.out.println();
        }
    }
}
