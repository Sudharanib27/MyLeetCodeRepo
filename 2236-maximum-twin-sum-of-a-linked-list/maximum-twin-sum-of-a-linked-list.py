# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def pairSum(self, head: Optional[ListNode]) -> int:
       
       #count nodes in the linked list
        pointer = head
        count = 0 
        while pointer:
            pointer = pointer.next
            count += 1
            

        # find the middle index
        mid = count // 2
        
        # creating the second linked list
        middle = None
        cur = head
        index = 0
        while cur:
            if index == mid:
                middle = cur
            cur = cur.next
            index += 1

        #reverse the second half of the linked list
        prev = None
        cur = middle
        while cur:
            nxt = cur.next
            cur.next = prev
            prev = cur
            cur = nxt

        # find the max sum
        total = 0
        first = head
        
        while prev:
            total = max(total, first.val + prev.val)
            first = first.next
            prev = prev.next

        return total
        