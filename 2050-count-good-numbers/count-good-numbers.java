class Solution {
    static final int MOD = 1000000007;
    public int countGoodNumbers(long n) {
        long even = (n+1)/2;
        long odd = n/2;

        long even_comb = powerMod(5, even);
        long odd_comb = powerMod(4, odd);

        return (int) ((even_comb * odd_comb) % MOD);
    }

    long powerMod(long base, long power) {
        long result = 1;
        base %= MOD;

        while(power > 0) {
            if (power % 2 == 0) {
                base = (base * base) % MOD;
                power /= 2;
            }
            else {
                result = (result * base) % MOD;
                power -= 1;
            }
        }
        return result;

    }
}