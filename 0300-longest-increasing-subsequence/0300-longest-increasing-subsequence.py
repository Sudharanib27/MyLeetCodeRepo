class Solution:
      
    def lengthOfLIS(self, nums: List[int]) -> int:
        a = [1] * len(nums)  
        for i in range(1,len(nums)):
            for j in range(0,i):
                if(nums[i] > nums[j]):
                    a[i] = max(a[j]+1,a[i]);  
            
        return max(a);
        