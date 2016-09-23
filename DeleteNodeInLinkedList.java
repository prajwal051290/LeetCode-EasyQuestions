/*Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.

Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third node with value 3, the linked list should become 1 -> 2 -> 4 after calling your function.

Logic:
Copy next node's data in cuurent node and keep doing this till the end of the linked list
*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void deleteNode(ListNode node) {
        ListNode prev = null;
        while(node.next!=null){
            int temp = node.val;
            node.val = node.next.val;
            node.next.val = temp;
            prev = node;
            node = node.next;
        }
        prev.next = null;
    }
}