class Solution {
    public void moveZeroes(int[] nums) {
        int L = 0;
        int R = 1;

        while (R < nums.length) {
            if (nums[L] != 0) {
                L++;
                R++;
            }
            else if (nums[R] == 0) {
                R++;
            }
            else {
                int temp = nums[L];
                nums[L] = nums[R];
                nums[R] = temp;
            }
        }
    }
}