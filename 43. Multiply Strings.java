// Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.

// Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.

 

// Example 1:

// Input: num1 = "2", num2 = "3"
// Output: "6"
// Example 2:

// Input: num1 = "123", num2 = "456"
// Output: "56088"
 

// Constraints:

// 1 <= num1.length, num2.length <= 200
// num1 and num2 consist of digits only.
// // Both num1 and num2 do not contain any leading zero, except the number 0 itself


import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) {
    /* 
     BigInteger bigInteger1 = new BigInteger(num1);
        BigInteger bigInteger2 = new BigInteger(num2);
        BigInteger bigInteger3 = bigInteger1.multiply(bigInteger2);
        return bigInteger3.toString(1);*/ 
        int n=num1.length();
        int n1=num2.length();
        int[] ans=new int[n+n1];
        Arrays.fill(ans,0);
        int k=n1+n;
        for(int i=n1-1;i>=0;i--){
            int carry=0;
            int x=num2.charAt(i)-'0';
            
            for(int j=n-1;j>=0;j--){
                int y=num1.charAt(j)-'0';
               int z=x*y;
              
               int s=carry+ans[i+j+1]+z;
                ans[i+j+1]=s%10;
                carry=s/10;
                // System.out.println(carry);
                if(j==0){
                  ans[i+j]=carry;  
                }
               
               

            }
        }
        StringBuilder str = new StringBuilder();
        for(int i=0; i<ans.length; i++) {
            if(str.length() == 0 && ans[i] == 0) {
            } else {
                str.append(ans[i]);
            }
        }
        if(str.length() == 0) {
            return "0";
        }
        return str.toString();
        
    }
}
