class Solution {
    public int removeElement(int[] nums, int val) {
      int i,x=0;
    
        for(i=0;i<nums.length;i++){
            if(nums[i]!=val)
            nums[x++]=nums[i];
            
        }
        return x;
        
    }
}
