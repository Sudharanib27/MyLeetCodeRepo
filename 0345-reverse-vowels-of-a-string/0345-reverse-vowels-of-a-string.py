class Solution:
    def reverseVowels(self, s: str) -> str:
        vow_l = 'aeiouAEIOU'
        temp = ''
        res = list(s)
        for i in s:
            if i in vow_l:
                temp = temp + i

        temp = temp[::-1]
        j=0
        
        for i in range(len(res)):
            if res[i] in vow_l:
                res[i] = temp[j]
                j+=1

        return ''.join(res)

        