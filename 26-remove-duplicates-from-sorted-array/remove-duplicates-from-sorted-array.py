class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        l = 0
        for r in range(len(nums)):
            if l != r and nums[r] != nums[l]:
                l += 1
                nums[l] = nums[r]
        
        return l+1