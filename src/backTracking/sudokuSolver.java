package backTracking;

public class sudokuSolver {
    public static void main(String[] args) {
        int[][] board={{5,3,0,0,7,0,0,0,0},
                        {6,0,0,1,9,5,0,0,0},
                        {0,9,8,0,0,0,0,6,0},
                        {8,0,0,0,6,0,0,0,3},
                        {4,0,0,8,0,3,0,0,1},
                        {7,0,0,0,2,0,0,0,6},
                        {0,6,0,0,0,0,2,8,0},
                        {0,0,0,4,1,9,0,0,5},
                        {0,0,0,0,8,0,0,7,9}};
        System.out.println(sudok(board));
    }
    static  void display(int[][] board){
        for(int[] row:board){
            for(int number:row){
                System.out.print(number+" ");
            }
            System.out.println();
        }
    }
    static boolean sudok(int[][] board){
        int n= board.length;
        int row=-1;
        int col=-1;
        boolean empty=true;
        //this is how we are replacing r,c in arguments
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(board[i][j]==0){
                    //found an empty place
                    row=i;
                    col=j;
                    empty=false;
                    break;
                }
            }
            //if you found some empty element in row then break
            if(empty==false){
                break;
            }
        }
        if(empty==true){
            return true;
            //sudok solved
        }
        //backtrack
        for (int i = 1; i <=9; i++) {
            if(isSafe(board,row,col,i)){
                board[row][col]=i;
                if(sudok(board)){
                    //found the answer
                    display(board);
                    return true;
                }
                else{
                    //backtrack
                    board[row][col]=0;
                }
            }
        }
        return false;
    }

    static boolean isSafe(int[][] board,int row,int col,int num){
        //check for row
        for (int i = 0; i < board.length; i++) {
            //check if the number is in the row
            if(board[row][col]==num){
                return false;
            }
        }
        //check for colm
        for (int i = 0; i < board.length; i++) {
            //check if the number is in the colm
            if (board[i][col] == num) {
                return false;
            }
        }

        int sqrt=(int)(Math.sqrt(board.length));
        //start
        int rowStart=row-row%sqrt;
        int colStart=col-col%sqrt;
        for (int r = rowStart; r < rowStart+sqrt; r++) {
            for (int c = colStart; c < colStart+sqrt; c++) {
                if(board[r][c]==num){
                    return false;
                }
            }
        }
        return true;
    }
}
