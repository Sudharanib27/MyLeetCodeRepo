class Solution:  
    def lengthOfLIS(self, nums: List[int]) -> int:
        LIS = [] * len(nums)

        for x in nums:
            if( len(LIS) == 0 or LIS[-1] < x):
                LIS.append(x)
            else:
                idx = bisect_left(LIS,x)
                LIS[idx] = x

        return len(LIS)  