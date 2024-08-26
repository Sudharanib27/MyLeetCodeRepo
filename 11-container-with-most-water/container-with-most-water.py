class Solution:
    def maxArea(self, height: List[int]) -> int:
        dist = len(height)-1
        maxn = 0
        left, right = 0, len(height) - 1
        while(left < right):
            maxn = max(maxn, (dist * min(height[left], height[right])))

            if height[left] < height[right]:
                left += 1
                dist -= 1
            
            else:
                right -= 1
                dist -= 1

        return maxn
        
