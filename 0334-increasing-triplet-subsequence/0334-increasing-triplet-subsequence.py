class Solution:
    def increasingTriplet(self, nums: List[int]) -> bool:
        dec = 0
        min_v = float('inf')
        max_v = float('inf')
        
        for i in range(len(nums)):

            if nums[i]<=min_v:
                min_v = nums[i]    

            elif nums[i]<max_v:
                max_v = nums[i]

            if (nums[i]>min_v and nums[i]>max_v) :
               dec = 1
               break
            

        return dec
            
        