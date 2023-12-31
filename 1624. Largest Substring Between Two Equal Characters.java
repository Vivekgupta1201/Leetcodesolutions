
// Given a string s, return the length of the longest substring between two equal characters, excluding the two characters. If there is no such substring return -1.

// A substring is a contiguous sequence of characters within a string.

 

// Example 1:

// Input: s = "aa"
// Output: 0
// Explanation: The optimal substring here is an empty substring between the two 'a's.
// Example 2:

// Input: s = "abca"
// Output: 2
// Explanation: The optimal substring here is "bc".
// Example 3:

// Input: s = "cbzxy"
// Output: -1
// Explanation: There are no characters that appear twice in s.
 

// Constraints:

// 1 <= s.length <= 300
//s contains only lowercase English letters.







class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
       int max=-1,n=s.length();
       /* for(int i=0;i<n;i++){
            int j=n-1;
            int count=-1;
            while(j>i){
                if(s.charAt(i)==s.charAt(j)){
                    count=j-i-1;
                break;

                }
                j--;

            }
            max=Math.max(max,count);
        }

       
        return max;*/




<-- 2nd approach-->
        HashMap<Character,Integer> index=new HashMap<>();
        for(int i=0;i<n;i++){
            if(index.containsKey(s.charAt(i))){
                max=Math.max(max,i-index.get(s.charAt(i))-1);
            }
            else
            index.put(s.charAt(i),i);
            
        }
        return max;
    }
}
