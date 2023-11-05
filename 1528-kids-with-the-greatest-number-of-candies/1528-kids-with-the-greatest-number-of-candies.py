class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        res = []
        res = [0 for i in range(len(candies))]
        
        for i,n in enumerate(candies):
            if n + extraCandies >= max(candies):
                res[i] = 1      

        return res