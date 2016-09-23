/*Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

Note:
You must do this in-place without making a copy of the array.
Minimize the total number of operations.

Logic:
1. Count Zeros
2. When non-zero element found, replace i-zerocount by the non-zero number*/

public class Solution {
    public void moveZeroes(int[] nums) {
        int zeroCount = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0)
                zeroCount++;
            else if(zeroCount>0){
                nums[i-zeroCount] = nums[i];
                nums[i] = 0;
            }
        }
    }
}