// Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

 

// Example 1:

// Input: nums1 = [1,2,2,1], nums2 = [2,2]
// Output: [2]
// Example 2:

// Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
// Output: [9,4]
// Explanation: [4,9] is also accepted.
 

// Constraints:

// 1 <= nums1.length, nums2.length <= 1000
// 0 <= nums1[i], nums2[i] <= 1000

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] temp = new int[1001];
        
        
        ArrayList<Integer> ans=new ArrayList<>();
        for (int n : nums1) {
            temp[n] = 1;
        }
        for (int n : nums2) {
           if( temp[n] == 1){
               
               ans.add(n);
               temp[n]=0;
           }
        }
        int j=0;
        int[] result=new int[ans.size()];
        for (Integer num : ans) {
            result[j++] = num;
        }
        return result;
    }
}
