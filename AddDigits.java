/*Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

For example:

Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.*/

/*
 * Logic:
 * 1. Using while loop - simple. Complexity - O(n)
 * 2. Property - Num%9 is the repeated addition of digits except 9, 18, 27 etc which are special cases.
 * This property is derived by observing addition of digits for multiple numbers
 */

public class Solution {
    public int addDigits(int num) {
        int result = num;
        
        while(result>=10){
            num = result;
            int add = 0;
            while(num!=0){
                add = add + num%10;
                num = num/10;
            }
            result = add;
        }
        return result;
    }
}

+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

public class Solution {
    public int addDigits(int num) {
        if(num<10)
            return num;
        else if(num%9==0)
            return 9;

        return num%9;
    }
}