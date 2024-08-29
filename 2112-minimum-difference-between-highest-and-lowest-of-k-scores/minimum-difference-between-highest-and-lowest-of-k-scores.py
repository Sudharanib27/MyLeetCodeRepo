class Solution:
    def minimumDifference(self, nums: List[int], k: int) -> int:
        nums.sort() # sort the array
        n = len(nums)
            
        if n <= k:
            return nums[n-1] - nums[0]
            
        res = float("inf")
        left, right = 0, k-1

        while right < n:
            res = min(res, nums[right]-nums[left])
            left += 1
            right += 1
        
        return res