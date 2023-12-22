class Solution {
    public int maxScore(String s) {
       int max=0;
      
        for(int i=0;i<s.length()-1;i++){
             int count0=0,flag=0,count1=0;
            for(int j=0;j<=i;j++){
                if(s.charAt(j)=='0'){
                    count0++;
                }
            }
             for(int k=i+1;k<s.length();k++){
                if(s.charAt(k)=='1'){
                    count1++;
                }
            }
            if(count1==s.length()||count0==s.length()){
                return s.length()-1;
            }

            max=Math.max(max,count1+count0);
        }
        return max;
    }
}
