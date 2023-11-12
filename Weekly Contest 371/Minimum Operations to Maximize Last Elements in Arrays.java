class Solution {
   
    
    public int minOperations(int[] num1, int[] num2) {
        int count=0,count1=0,n=num1.length;
        int num1l=num1[n-1];
        int num2l=num2[n-1];
        for(int i=0;i<n;i++){
           if(Math.max(num1[i],num2[i])>Math.max(num1l,num2l)||Math.min(num1[i],num2[i])>Math.min(num1l,num2l))
                return -1;

           if (num1[i] > num1l|| num2[i] > num2l) count++;
            if (num1[i] > num2l || num2[i] > num1l) count1++;
        } 

return Math.min(count,count1);
    }
}
