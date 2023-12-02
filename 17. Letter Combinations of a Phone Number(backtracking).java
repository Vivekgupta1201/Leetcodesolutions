class Solution {
    List<String> res=new ArrayList<>();
         String[] arr = {"","", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
         if(digits.length()==0)
          return res;
        StringBuilder str=new StringBuilder();
        letter(digits,0,str);
        return res; 
    }
    public void letter(String s,int i,StringBuilder sb){
        if(i==s.length()){
            res.add(sb.toString());
            
            return;   
        } 
        int x=(s.charAt(i)-'0');
        System.out.println(x);
        for(int j=0;j<arr[x].length();j++){
            letter(s,i+1,sb.append(arr[x].charAt(j)));
             sb.deleteCharAt(sb.length()-1);
             
        }
    
       
    }

}
