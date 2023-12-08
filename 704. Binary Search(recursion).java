// Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

// You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4




class Solution {
    public int search(int[] nums, int target) {
      return serachrecursion(0,nums.length-1,target,nums);
    }
    public  int serachrecursion(int start, int last, int target, int[] a) {
        int mid=(start+last)/2;
        if(start>last){
            return -1;
        }
        if(a[mid]==target){
            return mid;
        }
        else if(a[mid]>target){
            last=mid-1;
          return  serachrecursion(start,last,target,a);
        }
        else {
           
          return  serachrecursion(mid+1,last,target,a);
        }
        //  return -1;
    }
}
