 Given  an  arbitrary  ransom  note  string  and  another  string  containing  letters from  all  the  magazines,  write  a  function  that  will  return  true  if  the  ransom   note  can  be  constructed  from  the  magazines ;  otherwise,  it  will  return  false.   

Each  letter  in  the  magazine  string  can  only  be  used  once  in  your  ransom  note.

Note:
You may assume that both strings contain only lowercase letters.

canConstruct("a", "b") -> false
canConstruct("aa", "ab") -> false
canConstruct("aa", "aab") -> true

/*
 * Logic:
 * 1. brute force
 * 2. sort
 * 3. hashmap (maintain letter count)
 * 4. array (maintain letter count)
 */

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];
        
        for(int i=0; i<magazine.length(); i++)
            arr[magazine.charAt(i)-'a']++;
            
        for(int i=0; i<ransomNote.length(); i++){
            if(arr[ransomNote.charAt(i)-'a']!=0)
                arr[ransomNote.charAt(i)-'a']--;
            else
                return false;
        }
        return true;    
    }
}