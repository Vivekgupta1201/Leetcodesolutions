class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0,multi=1,result=0;
        while(n>0){
            int digit=n%10;
            sum+=digit;
            multi*=digit;
            n/=10;
        }
        return multi-sum;
        
    }
}
