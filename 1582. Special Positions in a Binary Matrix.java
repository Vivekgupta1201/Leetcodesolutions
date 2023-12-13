class Solution {
    public int numSpecial(int[][] mat) {
        int count=0;
    
        int [] col=new int[mat[0].length];
        
        for(int i=0;i<mat.length;i++){
            int rowcount=0;
            int com=0;
             for(int j=0;j<mat[0].length;j++){
            
            if(mat[i][j]==1){
                rowcount++;

            
            if(rowcount==1){
               col[j]+=1;
               com=j;
            }
            else{
                col[com]+=1;
                col[j]+=2;

            }
            }
        

        }
        }
        for(int i=0;i<col.length;i++){
            if(col[i]==1){
                count++;
            }
        }
        return count;
        
    }
}
