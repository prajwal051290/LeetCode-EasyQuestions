/*Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.

Example:
Given a = 1 and b = 2, return 3.*/

/*
 * Logic: Xor Operation gives addition
 * AND operation gives carry
 * to forward the carry, you shigt it by 1 bit i.e. << 1
 */

public class Solution {
    public int getSum(int a, int b) {
        if(a==0) return b;
        while(b!=0){
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }
}