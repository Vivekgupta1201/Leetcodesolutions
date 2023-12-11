// Given an integer array sorted in non-decreasing order, there is exactly one integer in the array that occurs more than 25% of the time, return that integer.
// Example 1:
// Input: arr = [1,2,2,6,6,6,6,7,10]
// Output: 6

class Solution {
    public int findSpecialInteger(int[] arr) {
        int element =arr[0],count=0;
        int percentage=arr.length/4;
        for(int i=0;i<arr.length;i++){
            if(element==arr[i]){
                count++;
                if(count>percentage){
                    return arr[i];
                }
            }
            else{
                count=1;
                element=arr[i];
            }

        }
        return 0;
    }
}
