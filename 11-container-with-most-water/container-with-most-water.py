class Solution:
    def maxArea(self, height: List[int]) -> int:
        # starting with min value
        maxarea = 0
        #two pointers
        left, right = 0, len(height) - 1

        while(left < right):
            # area of rectangle = breadth * height
            maxarea = max(maxarea, ((right - left) * min(height[left], height[right])))

            if height[left] < height[right]:
                left += 1
            
            else:
                right -= 1

        return maxarea
        
