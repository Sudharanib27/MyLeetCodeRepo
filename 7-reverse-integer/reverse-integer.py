class Solution:
    def reverse(self, x: int) -> int:
        reb_flag = False
        if x < 0:
            x = 0 - x
            reb_flag = True
            biggest = str(2**31)
        else:
            biggest = str((2**31)-1)
        
        x_str = str(x)[::-1]
        
        if len(x_str) >= len(biggest):
            for i in range(len(x_str)):
                if x_str[i] > biggest[i]:
                    return 0
                if x_str[i] < biggest[i]:
                    break

        return int(x_str) if not reb_flag else 0-int(x_str)