/*2482. Difference Between Ones and Zeros in Row and Column
Solved
Medium
Topics
Companies
Hint
You are given a 0-indexed m x n binary matrix grid.

A 0-indexed m x n difference matrix diff is created with the following procedure:

Let the number of ones in the ith row be onesRowi.
Let the number of ones in the jth column be onesColj.
Let the number of zeros in the ith row be zerosRowi.
Let the number of zeros in the jth column be zerosColj.
diff[i][j] = onesRowi + onesColj - zerosRowi - zerosColj
Return the difference matrix diff.

 

Example 1:


Input: grid = [[0,1,1],[1,0,1],[0,0,1]]
Output: [[0,0,4],[0,0,4],[-2,-2,2]]
Explanation:
- diff[0][0] = onesRow0 + onesCol0 - zerosRow0 - zerosCol0 = 2 + 1 - 1 - 2 = 0 
- diff[0][1] = onesRow0 + onesCol1 - zerosRow0 - zerosCol1 = 2 + 1 - 1 - 2 = 0 
- diff[0][2] = onesRow0 + onesCol2 - zerosRow0 - zerosCol2 = 2 + 3 - 1 - 0 = 4 
- diff[1][0] = onesRow1 + onesCol0 - zerosRow1 - zerosCol0 = 2 + 1 - 1 - 2 = 0 
- diff[1][1] = onesRow1 + onesCol1 - zerosRow1 - zerosCol1 = 2 + 1 - 1 - 2 = 0 
- diff[1][2] = onesRow1 + onesCol2 - zerosRow1 - zerosCol2 = 2 + 3 - 1 - 0 = 4 
- diff[2][0] = onesRow2 + onesCol0 - zerosRow2 - zerosCol0 = 1 + 1 - 2 - 2 = -2
- diff[2][1] = onesRow2 + onesCol1 - zerosRow2 - zerosCol1 = 1 + 1 - 2 - 2 = -2
- diff[2][2] = onesRow2 + onesCol2 - zerosRow2 - zerosCol2 = 1 + 3 - 2 - 0 = 2 
*/



class Solution {
        
    
    public int[][] onesMinusZeros(int[][] grid) {
        int[] rowones=new int[grid.length];
        Arrays.fill(rowones, -1);
        int rowzero[]=new int[grid.length];
        int colones[]=new int[grid[0].length];
        int colzero[]=new int[grid[0].length];
         Arrays.fill(rowzero, -1);
         Arrays.fill(colones, -1);
         Arrays.fill(colzero, -1);
       
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
               if(rowones[i]==-1){
                   countrow(grid,i,rowones,rowzero);
               }
               if(colones[j]==-1){
                    countcol(grid,j,colones,colzero);
               }
               grid[i][j]=rowones[i]+colones[j]-rowzero[i]-colzero[j];
            }
        }
        return grid;

        
    }
    public void countrow(int[][] grid,int index,int[] rowones,int[] rowzero){
     index=index;
        int countr1=0,countz0=0;
        for(int i=0;i<grid[0].length;i++){
            if(grid[index][i]==0){
                countz0++;
            }
            else{
                countr1++;
            }

        }
        rowones[index]=countr1;
        rowzero[index]=countz0;

    }
     public void countcol(int[][] grid,int index,int[] colones, int[] colzero){
        int countr=0,countz=0;
        for(int i=0;i<grid.length;i++){
            if(grid[i][index]==0){
                countz++;
            }
            else{
                countr++;
            }

        }
        colones[index]=countr;
        colzero[index]=countz;
     }
}
