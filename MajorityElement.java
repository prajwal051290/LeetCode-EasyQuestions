/*Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.*/

/*
 * Logic:
 * 1. Use hashmap and maintain count
 * 2. Sort the array and count
 */
public class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> numCount = new HashMap<Integer,Integer>();
        int i = 0;
        for(; i<nums.length; i++){
            if(numCount.containsKey(nums[i])){
                int val = numCount.get(nums[i])+1;
                if(val>nums.length/2)
                    break;
                numCount.put(nums[i],val);
            }
            else{
                if(1>nums.length/2)
                    break;
                numCount.put(nums[i],1);
            }
        }
        return nums[i];    
    }
}