// Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer (similar to C/C++'s atoi function).

// The algorithm for myAtoi(string s) is as follows:

// Read in and ignore any leading whitespace.
// Check if the next character (if not already at the end of the string) is '-' or '+'. Read this character in if it is either. This determines if the final result is negative or positive respectively. Assume the result is positive if neither is present.
// Read in next the characters until the next non-digit character or the end of the input is reached. The rest of the string is ignored.
// Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32). If no digits were read, then the integer is 0. Change the sign as necessary (from step 2).
// If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then clamp the integer so that it remains in the range. Specifically, integers less than -231 should be clamped to -231, and integers greater than 231 - 1 should be clamped to 231 - 1.
// Return the integer as the final result.
// Note:

// Only the space character ' ' is considered a whitespace character.
// Do not ignore any characters other than the leading whitespace or the rest of the string after the digits.
 

// Example 1:

// Input: s = "42"
// Output: 42
// Explanation: The underlined characters are what is read in, the caret is the current reader position.
// Step 1: "42" (no characters read because there is no leading whitespace)
//          ^
// Step 2: "42" (no characters read because there is neither a '-' nor '+')
//          ^
// Step 3: "42" ("42" is read in)
//            ^
// The parsed integer is 42.
// Since 42 is in the range [-231, 231 - 1], the final result is 42.


class Solution {
    public int myAtoi(String s){
        int INT_MAX = (int) Math.pow(2, 31) ;
        int INT_MIN = (int) Math.pow(-2, 31);
      int flag=1;
     double r=0;
       String[] p= s.trim().split(" ");
       String g=p[0];
       if(g.length()==0){
           return 0;
       }
        if(g.charAt(0)=='-'){
               flag=0;
           }
           else if(Character.isDigit(g.charAt(0)))
            r=r*10+(g.charAt(0)-'0');
             else  if(g.charAt(0)=='+'){
             }
               
           else  if(g.charAt(0)=='.'){
               return 0;
           }
           else
           return 0;
       for(int i=1;i<g.length();i++){
          
          if(Character.isDigit(g.charAt(i))){
             r=r*10+(g.charAt(i)-'0');
            
           }
           else
            break;
       }
       if(flag==0){
       r*=-1;
       }
      
      if(r>INT_MAX)
       r=INT_MAX;
        if(r<INT_MIN)
       r=INT_MIN;
     
        return (int)r;
        
    }
}
