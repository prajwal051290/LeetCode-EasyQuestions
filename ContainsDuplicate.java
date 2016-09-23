/*Given an array of integers, find if the array contains any duplicates. Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.*/

/*
 * Logic:
 * Use Set<Integer>
 */
public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numbers = new HashSet<Integer>();
        for(int i=0; i<nums.length; i++){
            if (numbers.contains(nums[i]))
                return true;
            else
                numbers.add(nums[i]);
        }
        return false;
    }
}