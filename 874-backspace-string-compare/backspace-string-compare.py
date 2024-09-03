class Solution:
    def backspaceCompare(self, s: str, t: str) -> bool:
        
        def getValidIndex(u, index):
            bs = 0
            while index >= 0:
                if bs == 0 and u[index] != '#':
                    break
                elif u[index] == '#':
                    bs += 1
                else:
                    bs -= 1
                index -= 1
            return index
        
        i, j = len(s)-1, len(t)-1

        while i >=0 or j >= 0:
            i = getValidIndex(s, i)
            j = getValidIndex(t, j)
            
            char_s = s[i] if i >= 0 else ""
            char_t = t[j] if j >= 0 else ""
            
            if char_s != char_t:
                return False
            i -= 1
            j -= 1
        
        return True

