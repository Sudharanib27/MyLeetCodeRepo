class Solution:
    def isPalindrome(self, s: str) -> bool:
        s = [i for i in s.lower() if i.isalnum()]
        low, high = 0, len(s) - 1

        while low < high:
            if s[low] != s [high]:
                return False
            
            low += 1
            high -= 1
        
        return True
