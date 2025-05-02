class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        max_len = 0
        s_seen = set()
        left = 0

        for right in range(len(s)):
            while s[right] in s_seen:
                s_seen.remove(s[left])
                left += 1
            s_seen.add(s[right])
            max_len = max(max_len, right-left+1)

        return max_len