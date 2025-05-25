# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        ### 1. Two pass Bruteforce
        # cur = head
        # count = 0

        # # Find the length of the list
        # while cur:
        #     cur = cur.next
        #     count += 1
        # print(count)

        # # edge case if count == n
        # if count == n:
        #     return head.next

        # # get cur to the right position
        # cur = head
        # i = 0
        # while i < count-n-1:
        #     cur = cur.next
        #     i += 1
        
        # cur.next = cur.next.next
        # return head

        ### 2. Optimised single pass
        slow = head
        fast = head
        count = 0
        while count < n and fast:
            fast = fast.next
            count += 1
        if not fast:
            return head.next
        while fast.next:
            slow = slow.next
            fast = fast.next
        slow.next = slow.next.next
        return head