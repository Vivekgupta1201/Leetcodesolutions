class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] clone=new int[nums.length];
        clone=nums.clone();
        Arrays.sort(clone);
        int n=nums.length,m=nums.length;
        for(int i=nums.length-1;i>=0;i--){
            if(clone[i]==nums[i]){
                n--;
            }
            else break;
          //  System.out.println(clone[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(clone[i]==nums[i]){
                m--;
            }
            else break;

        }
        if(n==0){
            return 0;
        }

        return n+m-nums.length;
    }
}
