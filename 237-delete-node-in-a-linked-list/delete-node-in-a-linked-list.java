/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode current = node;
        ListNode nxt = node.next;

        while(nxt != null) {
            current.val = nxt.val;
            if(nxt.next != null) {
                current = nxt;
            }
            nxt = nxt.next;
        }

        current.next = null;
    }
}