class Solution:
    def validPalindrome(self, s: str) -> bool:
        if s == s[::-1]:
            return True
            
        def ispalindrome(t, l, r):
            while l < r:
                if t[l] != t[r]:
                    return False
                l += 1
                r -= 1
            return True
        
        left, right = 0, len(s)-1

        while left < right:
            if s[left] != s[right]:
                return ispalindrome(s, left+1, right) or ispalindrome(s, left, right-1)
            left += 1
            right -= 1
        
        return True