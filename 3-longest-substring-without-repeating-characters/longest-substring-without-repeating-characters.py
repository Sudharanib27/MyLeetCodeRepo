class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        max_length = 0
        seen = set()
        left = 0
        for right in range(len(s)):
            while(s[right] in seen and right < len(s)):
                seen.remove(s[left])
                left += 1
            seen.add(s[right])
            max_length = max(max_length, right-left+1)
        return max_length
