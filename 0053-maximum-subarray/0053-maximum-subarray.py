class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        max_v = sum_v = nums[0]

        for i in range(1,len(nums)):
            sum_v = max(sum_v + nums[i],nums[i])
            max_v = max(sum_v,max_v)
        
        return max_v
        