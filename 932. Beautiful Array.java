// An array nums of length n is beautiful if:

// nums is a permutation of the integers in the range [1, n].
// For every 0 <= i < j < n, there is no index k with i < k < j where 2 * nums[k] == nums[i] + nums[j].
// Given the integer n, return any beautiful array nums of length n. There will be at least one valid answer for the given n.

 

// Example 1:

// Input: n = 4
// Output: [2,1,4,3]
// Example 2:

// Input: n = 5
// Output: [3,1,2,5,4]
 

// Constraints:

// 1 <= n <= 1000


class Solution {
    public int[] beautifulArray(int n) {
        ArrayList<Integer>ans=new ArrayList<>();
        ans.add(1);
        int x=1;
        while(x<=n){
             ArrayList<Integer>an=new ArrayList<>();
             for(int i=0;i<ans.size();i++){
                 if(ans.get(i)*2-1<=x){
                     an.add(ans.get(i)*2-1);
                 }
             }
              for(int i=0;i<ans.size();i++){
                 if(ans.get(i)*2<=x){
                     an.add(ans.get(i)*2);
                 }
             }
               x++;
             ans=an;

        }
        int[]answer=new int[n];
        for(int i=0;i<n;i++){
            answer[i]=ans.get(i);
        }
      
        return answer;
        
    }
    
}