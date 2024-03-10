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
        odd = dummy.next
        even = dummy.next.next
        even_head = even

        while even != None and even.next != None:
            odd.next = even.next
            even.next = odd.next.next

            odd.next.next = even_head
            odd = odd.next
            even = even.next

        return head
