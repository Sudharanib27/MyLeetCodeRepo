class Solution:
    def trap(self, height: List[int]) -> int:
        if not height: return 0

        left, right = 0, len(height)-1
        lmax, rmax = height[left], height[right]
        res = 0

        while left < right:
            if lmax < rmax:
                left += 1
                res += max(0, lmax-height[left])
                if height[left] > lmax:
                    lmax = height[left]
            else:
                right -= 1
                res += max(0, rmax-height[right])
                if height[right] > rmax:
                    rmax = height[right]

        return res
            



        
        