# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def deleteNode(self, node):
        """
        :type node: ListNode
        :rtype: void Do not return anything, modify node in-place instead.
        """
        prevp = node
        nextp = node.next

        while(nextp.next != None):
            prevp.val = nextp.val
            prevp = nextp
            nextp = nextp.next
        
        prevp.val = nextp.val
        prevp.next = None


