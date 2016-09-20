/*Given two arrays, write a function to compute their intersection.

Example:
Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].

Note:
Each element in the result must be unique.
The result can be in any order.*/

/*
 * Logic:
 * Using set & ArrayList
 */

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        Set<Integer> nums = new HashSet<Integer>();
        
        for(int i=0; i<nums1.length; i++)
            nums.add(nums1[i]);
            
        for(int i=0; i<nums2.length; i++){
            if(nums.contains(nums2[i]) && !temp.contains(nums2[i]))
                temp.add(nums2[i]);
        }
        
        int[] result = new int[temp.size()];
        
        for(int i=0; i<temp.size(); i++){
            result[i] = temp.get(i);
        }
        
        return result;
    }
}