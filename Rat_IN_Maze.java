import java.util.ArrayList;
import java.util.List;

public class Rat_IN_Maze {
    public static void solve(int maze [][],List<String> ans,StringBuilder temp,String dlr,int row, int col){
        if(row==maze.length-1 && col==maze[0].length-1){
            ans.add(temp.toString());
        }
        int delRow[] ={1,0,0,-1};
        int delCol[] ={0,-1,1,0};
        
        for(int i=0; i<4;i++){
            int newRow = row + delRow[i];
            int newCol = col + delCol[i];
            if(newRow>=0 && newRow<maze.length && newCol>=0 && newCol<maze[0].length && maze[newRow][newCol]==1){
                temp.append(dlr.charAt(i));
                maze[row][col]=0;
                solve(maze, ans, temp, dlr, newRow, newCol);
                temp.deleteCharAt(temp.length()-1);
                maze[row][col]=1;
            }
        }
    }
    public static void main(String[] args) {
        int maze [][] = {
                        {1, 0, 0, 0},
                        {1, 1, 0, 1},
                        {1, 1, 0, 0},
                        {0, 1, 1, 1}
                        };
        StringBuilder temp= new StringBuilder();
        List<String> ans = new ArrayList<>();
        String dlr = "DLRU";
        solve(maze,ans,temp,dlr,0,0);
        for(String a: ans){
            System.out.println(a);
        }
    }
}
