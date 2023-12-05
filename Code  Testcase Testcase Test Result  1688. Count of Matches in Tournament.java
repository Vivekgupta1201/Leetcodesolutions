class Solution {
    public int numberOfMatches(int n) {
       int advance=0,match=0;
      while(n>1){
            if(n%2==0){
                advance=n/2;
                match+=advance;
                n=advance;

            }
            else{
                match+=n/2;
                advance =(n/2)+1; 
                n=advance;           }
        }
        return match;
    }
}
