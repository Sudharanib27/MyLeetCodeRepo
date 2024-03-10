# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def oddEvenList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        dummy = ListNode(0, head)
        if dummy.next == None:
            return None
        slow = dummy.next
        fast = dummy.next.next
        even_head = fast

        while fast != None and fast.next != None:
            slow.next = fast.next
            fast.next = slow.next.next

            slow.next.next = even_head
            slow = slow.next
            fast = fast.next

        return head
