class Solution:
    def canPlaceFlowers(self, flowerbed: List[int], n: int) -> bool:
        
        count = 0
        f_len = len(flowerbed)

        if(f_len == 1 and flowerbed[0]==0):
            flowerbed[0] = 1
            count+=1
        
        if (f_len>1 and flowerbed[0]==0 and flowerbed[1]==0):
            flowerbed[0] = 1
            count+=1
        if (f_len>1 and flowerbed[f_len-1]==0 and flowerbed[f_len-2]==0):
            flowerbed[f_len-1] = 1
            count+=1

        if(f_len>1):
            for i in range(1,len(flowerbed)-2):
                if flowerbed[i]==0 and flowerbed[i-1] == 0 and flowerbed[i+1] == 0:
                    flowerbed[i] = 1
                    count+=1

        print(count)
        if count >= n:
            return 1
        else:
            return 0