class Solution {
    public int firstMissingPositive(int[] nums) {
       HashMap<Integer,Integer> hs=new HashMap<>();
        int max=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            hs.put(nums[i],1);
        }
        if(max<=0){
            return 1;
        }

for(int i=1;i<=max;i++){
          if(!hs.containsKey(i)){
              return i;
          }
        }
        return max+1;
       
    }
}
