/*Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Example:
	s = "leetcode"
	return 0.

	s = "loveleetcode",
	return 2.
			
Note: You may assume the string contain only lowercase letters.
*/

/*
 * Logic:
 * use array of 26 size and maintain count.
 * 2 loops required.
 * Complexity - O(n)
 */

public class Solution {
    public int firstUniqChar(String s) {
        int[] charCount = new int[26];
        for(int i=0; i<s.length(); i++)
            charCount[s.charAt(i)-'a']++;
        for(int i=0; i<s.length(); i++){
            if(charCount[s.charAt(i)-'a']==1)
                return i;
        }
        return -1;
    }
}