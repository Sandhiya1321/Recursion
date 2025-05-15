package maze;

public class obstacles {
    public static void main(String[] args) {
        boolean[][] board={{true,true,true},
                {true,false,true},
                {true,true,true}
        };
        pathRestriction("",board,0,0);
    }
    static void pathRestriction(String p,boolean[][] maze,int row,int col){
        if(row==maze.length-1&&col==maze[0].length-1){
            System.out.println(p);
            return;
        }
        //not false
        if(!maze[row][col]){
            return;
        }
        if(row<maze.length-1){
            pathRestriction(p+'D',maze,row+1,col);
        }
        if(col<maze[0].length-1){
            pathRestriction(p+'R',maze,row,col+1);
        }
    }
}