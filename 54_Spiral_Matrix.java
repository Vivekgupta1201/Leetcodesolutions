class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int row=matrix.length,col=matrix[0].length;
    List<Integer> ans=new ArrayList<>();
   
     int i=0;
     int count=row*col;
    
     while(i<row){
          for(int j=i;j<col;j++){
              ans.add(matrix[i][j]);
              count--;
               if(count==0){
              return ans;
          }
          }
          for(int k=i+1;k<row;k++){
              ans.add(matrix[k][col-1]);
              count--;
               if(count==0){
              return ans;
          }
          }
            for(int l=col-2;l>=i;l--){
              ans.add(matrix[row-1][l]);
              count--;
               if(count==0){
              return ans;
          }
          }
          for(int m=row-2;m>i;m--){
              ans.add(matrix[m][i]);
              count--;
               if(count==0){
              return ans;
          }

          }
          i++;
          row--;
          col--;
         
        
      }
        return ans;
    }
}
