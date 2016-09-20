/*Given two binary trees, write a function to check if they are equal or not.

Two binary trees are considered equal if they are structurally identical and the nodes have the same value.*/

/*
 * Logic:
 * Recursion left and right.
 * You cannot check for p.val == q.val at start otherwise the recursion would not reach till the leaf node
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null)
            return true;
        if(p==null && q!=null)
            return false;
        if(q==null && p!=null)
            return false;
        
        boolean left = isSameTree(p.left,q.left);
        boolean right = isSameTree(p.right,q.right);
        
        if(left && right && p.val == q.val)
            return true;
        else
            return false;
    }
}