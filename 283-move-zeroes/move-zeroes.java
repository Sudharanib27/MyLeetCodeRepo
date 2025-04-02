class Solution {
    public void moveZeroes(int[] nums) {
        // Method 1:
        // int L = 0;
        // int R = 1;

        // while (R < nums.length) {
        //     if (nums[L] != 0) {
        //         L++;
        //         R++;
        //     }
        //     else if (nums[R] == 0) {
        //         R++;
        //     }
        //     else {
        //         int temp = nums[L];
        //         nums[L] = nums[R];
        //         nums[R] = temp;
        //     }
        // }

        // Method 2:
        int r = 0;
        for (int l = 0; l < nums.length; l++) {
            if (nums[l] != 0 && nums[r] == 0) {
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
            }

            if (nums[r] != 0) {
                r++;
            }
        }
    }
}