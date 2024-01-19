// Given an array of integers nums, sort the array in increasing order based on the frequency of the values. If multiple values have the same frequency, sort them in decreasing order.

// Return the sorted array.

 

// Example 1:

// Input: nums = [1,1,2,2,2,3]
// Output: [3,1,1,2,2,2]
// Explanation: '3' has a frequency of 1, '1' has a frequency of 2, and '2' has a frequency of 3.
// Example 2:

// Input: nums = [2,3,1,3,2]
// Output: [1,3,3,2,2]
// Explanation: '2' and '3' both have a frequency of 2, so they are sorted in decreasing order.
// Example 3:

// Input: nums = [-1,1,-6,4,5,-6,1,4,1]
// Output: [5,-1,4,4,-6,-6,1,1,1]
 

// Constraints:

// 1 <= nums.length <= 100
// -100 <= nums[i] <= 100


class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer,Integer> hs=new HashMap<>();
      ArrayList<Integer> list=new ArrayList<>();
      for(Integer x:nums){
          if(hs.containsKey(x)){
              hs.put(x,hs.get(x)+1);

          }
          else{
          hs.put(x,1);
          }
          list.add(x);

      }

      Collections.sort(list,new Comparator<Integer>(){
            public int compare(Integer a, Integer b) {
                if(hs.get(a)==hs.get(b))
                return (b).compareTo(a);
                else
                 return ( hs.get(a)).compareTo(hs.get(b));
                
            }
     });
      System.out.println(list);
     
          for(int i=0;i<list.size();i++){
              nums[i]=list.get(i);
          }
     
      return nums; 
    }
}
