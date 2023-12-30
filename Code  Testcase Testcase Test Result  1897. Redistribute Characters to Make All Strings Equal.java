
// You are given an array of strings words (0-indexed).

// In one operation, pick two distinct indices i and j, where words[i] is a non-empty string, and move any character from words[i] to any position in words[j].

// Return true if you can make every string in words equal using any number of operations, and false otherwise.

 

// Example 1:

// Input: words = ["abc","aabc","bc"]
// Output: true
// Explanation: Move the first 'a' in words[1] to the front of words[2],
// to make words[1] = "abc" and words[2] = "abc".
// All the strings are now equal to "abc", so return true.
// Example 2:

// Input: words = ["ab","a"]
// Output: false
// Explanation: It is impossible to make all the strings equal using the operation.
 

// Constraints:

// 1 <= words.length <= 100
// 1 <= words[i].length <= 100
// words[i] consists of lowercase English letters.















class Solution {
    public boolean makeEqual(String[] words) {
        if(words.length==1){
            return true;
        }
        HashMap<Character,Integer> hs=new HashMap<>();
        for(int i=0;i<words.length;i++){
             String s=words[i];
            for(int j=0;j<s.length();j++){
               
                if(hs.containsKey(s.charAt(j))){
                    hs.put(s.charAt(j),hs.get(s.charAt(j))+1);
                }
                else{
                    hs.put(s.charAt(j),1);
                }
            }
        }
        int y=words.length;
        // System.out.println(y);
        for(Integer x:hs.values()){
           
          if(x%y!=0){
            return false;  
          }
         
          
        }
        return true;
        
    }
}