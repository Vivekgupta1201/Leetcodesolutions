// Convert a non-negative integer num to its English words representation.

 

// Example 1:

// Input: num = 123
// Output: "One Hundred Twenty Three"



class Solution {
     String[] Ones = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen", "Twenty"};
     String[] Tens = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
     String[] Thousands = {"", "Thousand", "Million", "Billion"};
      String result="";
      int i=0;
    public String numberToWords(int num) {
        
        if(num<=20){
            return Ones[num];
        }
        
        while(num>0){
           if (num % 1000 == 0){
               result=result;
           }
           else
           result = helper(num%1000) +Thousands[i] +" " + result;
            num/=1000;
            i++;
        }
        return result.trim();
        
        
    }
    public String helper(int num){
        if(num==0){
            return "";
        }
       else  if(num<=20){
           return Ones[num]+" ";
        }
        else if(num<100){
            return Tens[num/10]+" "+ helper(num%10);
        }
         else {
             if(num/100!=0){
                 return Ones[num/100]+" Hundred " + helper(num%100);
             }
         }
        
     return result;

    }
}
