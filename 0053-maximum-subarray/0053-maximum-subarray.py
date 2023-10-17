class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        dp = [0] * len(nums)

        for i, x in enumerate(nums):
            if len(dp) == 0 or x + dp[i-1] > x:
                dp[i]= dp[i-1] + x 
            else:
                dp[i] = x

        return max(dp)
        