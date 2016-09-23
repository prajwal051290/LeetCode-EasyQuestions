/*Related to question Excel Sheet Column Title

Given a column title as appear in an Excel sheet, return its corresponding column number.

For example:

	A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 
    */

//Logic:
/*
 * Consider base of 26 because there are total 26 characters.
 * This is like binary conversion
 */

	

public class Solution {
    public int titleToNumber(String s) {
        int num = 0;
        int power = 0;
        for(int i=s.length()-1; i>=0; i--){
            char temp = s.charAt(i);
            num = num + ((int)Math.pow(26,power) * ((temp-'A')+1));
            power++;
        }
        return num;
    }
}