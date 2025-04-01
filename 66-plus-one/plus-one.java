class Solution {
    public int[] plusOne(int[] digits) {
        // case1: array without 9 : eg: [1, 4, 5]
        // case2: array with few 9 in the end : eg: [1, 4, 5, 9, 9, 9]
        // case3: array with all 9 : eg: [9, 9, 9, 9]
        int curDigit = digits.length - 1;

        while(digits[curDigit] == 9) {
            if (curDigit == 0) {
                int[] result = new int[digits.length + 1];
                result[0] = 1;
                return result;
            }
            digits[curDigit] = 0;
            curDigit--;
        }

        digits[curDigit]++;
        return digits;
    }
}