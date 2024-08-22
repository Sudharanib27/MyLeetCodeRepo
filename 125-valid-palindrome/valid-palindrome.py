class Solution:
    def isPalindrome(self, s: str) -> bool:
        s1 = ""
        for i in s  :
            if i.isalnum():
                s1 += i.lower()
        
        print(s1)

        for i in range(len(s1)):
            if s1[i] != s1[len(s1) - i - 1]:
                return 0

        return 1
       


        
            
        