// You are given an array of strings words and a string chars.

// A string is good if it can be formed by characters from chars (each character can only be used once).

// Return the sum of lengths of all good strings in words.

 

// Example 1:

// Input: words = ["cat","bt","hat","tree"], chars = "atach"
// Output: 6
// Explanation: The strings that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.
// Example 2:

// Input: words = ["hello","world","leetcode"], chars = "welldonehoneyr"
// Output: 10
// Explanation: The strings that can be formed are "hello" and "world" so the answer is 5 + 5 = 10.
 

// Constraints:

// 1 <= words.length <= 1000
// 1 <= words[i].length, chars.length <= 100
// words[i] and chars consist of lowercase English letters.

class Solution {
    HashMap<Character,Integer>hs= new HashMap<>();
    public int countCharacters(String[] words, String chars) {
        int sum=0;
        
        for(int i=0;i<chars.length();i++){
            if(hs.containsKey(chars.charAt(i))){
                hs.put(chars.charAt(i),hs.get(chars.charAt(i))+1);
            }
            else{
                 hs.put(chars.charAt(i),1);
            }
        }
        for(int i=0;i<words.length;i++){
            HashMap<Character,Integer>hs1= new HashMap<>();
             for(int j=0;j<words[i].length();j++){
            if(hs1.containsKey(words[i].charAt(j))){
                hs1.put(words[i].charAt(j),hs1.get(words[i].charAt(j))+1);
            }
            else{
                 hs1.put(words[i].charAt(j),1);
            }
        }
        if(check(hs1)){
            sum+=words[i].length();
        }

        }
        

        return sum;
    }
     public boolean check( HashMap<Character,Integer> x){
        for(Character s:x.keySet()){
            if(!hs.containsKey(s)) return false;
           else if(x.get(s)>hs.get(s)) return false;
        }
        return true;
    }
}
