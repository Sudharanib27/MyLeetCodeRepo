class Solution:
    def countGoodNumbers(self, n: int) -> int:
        odd = n // 2
        even = (n + 1) // 2
        mod = pow(10, 9) + 7
        result = (pow(5, even, mod)  * pow(4, odd, mod)) % mod
        return result
        