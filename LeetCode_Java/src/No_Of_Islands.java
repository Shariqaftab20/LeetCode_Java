// Given a 2d grid map of 1's (land) and 0s (water), count the number of islands.
//  An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
//  You may assume all four edges of the grid are all surrounded by water
public class No_Of_Islands {
    public static void main(String[] args) {
        char grid[][]={{'1','1','1','0','0'},
                        {'1','1','0','0','0'},
                        {'0','0','1','0','0'},
                        {'0','0','0','1','1'}};
        System.out.print(islandCount(grid));
    }
    public static int islandCount(char[][] grid) {
        int count=0;
        for(int i=0;i<grid.length; i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]=='1')
                {
                    count++;
                    callBFS(grid,i,j);
                }
            }
        }
        return count;
    }
    public static void callBFS(char[][] grid, int i, int j)
    {
        if(i<0||j<0||i>=grid.length||j>=grid[i].length||grid[i][j]=='0')
        return;
        grid[i][j]='0';
        callBFS(grid, i+1, j);
        callBFS(grid, i-1, j);
        callBFS(grid, i, j+1);
        callBFS(grid, i, j-1);
    }
}
