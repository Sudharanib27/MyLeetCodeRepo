# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def pairSum(self, head: Optional[ListNode]) -> int:
        #return if no node element
        if head == None:
            return 0
        
        slow = head
        fast = head.next

        #return the sum if there are only two nodes
        if fast.next == None:
            return slow.val + fast.val
        
        #find the mid element and last element
        while(fast.next != None and fast.next.next != None):
            slow = slow.next
            fast = fast.next.next

        prev = None
        cur = slow.next
        nxt = slow.next.next
        slow.next =None
        
        #reversing second half of the linked list
        while(nxt != None):
            cur.next = prev
            #print(prev)
            prev = cur
            cur = nxt
            nxt = nxt.next

        cur.next = prev
        total = 0
        slow = head
       
       #finding the maximum sum
        while slow != None and fast != None:
            total = max(total, slow.val + fast.val)
            slow = slow.next
            fast = fast.next

        return total