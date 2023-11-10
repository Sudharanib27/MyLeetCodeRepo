class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        l = len(nums)
        dp1= [] * l
        dp2= [] * l
        dp = [] * l
        prod1,prod2 = 1,1

        for i in range(0,l,1):
           dp1.append(prod1)
           prod1 *= nums[i]
        print(dp1)
        for i in range(l-1,-1,-1):
            print(i)
            dp2.append(prod2)
            prod2 *= nums[i]
        dp2 = dp2[::-1]
        print(dp2)
        for i in range(l):
            dp.append(dp1[i] * dp2[i])

        return dp

