class Solution {
    public String reverseOnlyLetters(String s) {
        int j=s.length()-1;
        StringBuilder sb=new StringBuilder(s);
       // for(int i=0;i<sb.length()/2;i++){
           int i=0;
           while(i<j){
            if(Character.isLetter(sb.charAt(i))){
                while(!Character.isLetter(sb.charAt(j))){
                    j--;
                }
                 char x=sb.charAt(i);
                sb.setCharAt(i, sb.charAt(j));
                sb.setCharAt(j, x);
                j--;
               
            }
            i++;
               

        }
        return sb.toString();
        
    }
}
