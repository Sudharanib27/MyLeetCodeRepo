import re
class Solution:
    def reverseWords(self, s: str) -> str:
        res = re.split(' ',s)
        res_rev = ''
        print(res)
        j = 0
        for i in reversed(range(len(res))):
            if res[i] !='':
                if(j!=0):
                    res_rev+=' '
                res_rev += str(res[i])
                print(i)
                j+=1
                
                
                
        print(res_rev)
        return(res_rev)