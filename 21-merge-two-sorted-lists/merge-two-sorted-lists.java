/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode prevNode = head;

        while (list1 != null || list2 != null) {
            ListNode curNode = new ListNode();
            prevNode.next = curNode;

            if (list1 == null) {
                curNode.val = list2.val;
                list2 = list2.next;
                prevNode = curNode;
                continue;
            }
            
            if (list2 == null) {
                curNode.val = list1.val;
                list1 = list1.next;
                prevNode = curNode;
                continue;
            }

            if (list1.val <= list2.val) {
                curNode.val = list1.val;
                list1 = list1.next;
            } else {
                curNode.val = list2.val;
                list2 = list2.next;
            }

            prevNode = curNode;

        }

        return head.next;
    }
}