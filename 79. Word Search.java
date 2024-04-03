// Given an m x n grid of characters board and a string word, return true if word exists in the grid.

// The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.

 

// Example 1:


// Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
// Output: true
// Example 2:


// Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "SEE"
// Output: true
// Example 3:


// Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCB"
// // Output: false


<--class Solution {
    public boolean exist(char[][] board, String word) {

      int row=board.length;
      int col=board[0].length;
      int [][] visited=new int[row][col];
      for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
               
                if (dfs(board, word, i, j, 0,visited))
                    return true; 
            }
        }
      
        return false;
    }
   private boolean dfs(char[][] board,String word,int i,int j,int index,int[][] visited){
    if(i<0||j<0||j>= board[0].length||i>=board.length||board[i][j] != word.charAt(index)||visited[i][j]==1){
        return false;
    }
    if (index == word.length() - 1)
            return true;

            visited[i][j]=1;
     boolean res = dfs(board, word, i + 1, j, index + 1,visited) || dfs(board, word, i - 1, j, index + 1,visited) ||
                      dfs(board, word, i, j + 1, index + 1,visited) || dfs(board, word, i, j - 1, index + 1,visited);
                      visited[i][j]=0;
          return res;  

    
    }
}-->
