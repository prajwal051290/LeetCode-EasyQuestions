/*Given two strings s and t, write a function to determine if t is an anagram of s.

For example,
s = "anagram", t = "nagaram", return true.
s = "rat", t = "car", return false.

Note:
You may assume the string contains only lowercase alphabets.

Follow up:
What if the inputs contain unicode characters? How would you adapt your solution to such case?*/		

/*
 * Logic:
 * Use hash map and keep count of characters. If anagram, then hashmap shoould be empty at the end
 */

public class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> charMap = new HashMap<Character,Integer>();
        for(int i=0; i<s.length(); i++){
            if(charMap.containsKey(s.charAt(i)))
                charMap.put(s.charAt(i),charMap.get(s.charAt(i)) + 1);
            else
                charMap.put(s.charAt(i),1);
        }
        for(int i=0; i<t.length(); i++){
            if(charMap.containsKey(t.charAt(i))){
                int count = charMap.get(t.charAt(i))-1;
                if(count == 0)
                    charMap.remove(t.charAt(i));
                else
                    charMap.put(t.charAt(i),count);
            }
            else
                return false;
        }
        if(charMap.size()==0)
            return true;
        else
            return false;
    }
}