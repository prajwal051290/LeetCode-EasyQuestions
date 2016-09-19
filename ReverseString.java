/*Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".*/

/*
 * Logic:
 * 1. use character array and swap characters from beginning and end. Complexity - O(n/2)
 * 2. Use StringBuidler() and append character from end of string. Complexity - O(n)
 */

public class Solution {
    public String reverseString(String s) {
        char[] arr = s.toCharArray();
        int i = 0;
        int j = s.length()-1;
        
        while(i<=j){
        	char temp = s.charAt(i);
        	s.charAt(i) = s.charAt(j);
        	s.charAt(j) = temp;
            i++;
            j--;
        }
        
        return String.valueOf(arr);
    }
}

+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

public class Solution {
    public String reverseString(String s) {
        StringBuilder sb = new StringBuilder();
        
        for(int i=s.length()-1; i>=0; i--)
            sb.append(s.charAt(i));
            
        return sb.toString();
    }
}