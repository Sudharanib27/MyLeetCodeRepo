class Solution:
    def minimumDifference(self, nums: List[int], k: int) -> int:
        nums.sort() # sort the array
        n = len(nums)
            
        if n <= k:
            return nums[n-1] - nums[0]
            
        res = float("inf")
        k -= 1
        i = 0

        for i in range(n-k):
            res = min(res, nums[i+k] - nums[i])
        
        return res