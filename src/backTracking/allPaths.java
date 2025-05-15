package backTracking;

public class allPaths {
    public static void main(String[] args) {
        boolean[][] board={{true,true,true},
                {true,true,true},
                {true,true,true},
                {true,true,true}

        };
        AllPath("",board,0,0);
    }
    static void AllPath(String p,boolean[][] maze,int row,int col){
        if(row==maze.length-1&&col==maze[0].length-1){
            System.out.println(p);
            return;
        }
        //not false
        if(!maze[row][col]){
            return;
        }
        //I am considering this is my path
        maze[row][col]=false;
        if(row<maze.length-1){
            AllPath(p+'D',maze,row+1,col);
        }
        if(col<maze[0].length-1){
            AllPath(p+'R',maze,row,col+1);
        }
        //--BACKTRACKING---
        //change the changes that made previously
        //marking the visited path as false while ur are currently at a recursion call once it has
        // been ended then change it to true while another recursion call is working at that place
        // while you are moving back restore the maze as it was
        // after a recursion call completed then change the marked false as true while going back
        // when do we go back ?  ----when function is returned(after finding a path)----
        // when you come out of the recursion function you are in above recursion call
        // while going back change false as true
        if(row>0){
            AllPath(p+'U',maze,row-1,col);
        }
        if(col>0){
            AllPath(p+'L',maze,row,col-1);
        }
        //at return is where the function will be over
        //so before the function gets removed also remove the changes made by that previous function
        maze[row][col]=true;
    }
}

