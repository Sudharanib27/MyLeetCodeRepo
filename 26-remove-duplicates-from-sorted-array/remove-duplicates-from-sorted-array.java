class Solution {
    public int removeDuplicates(int[] nums) {
        int unique_index = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[unique_index] != nums[i]) {
                nums[unique_index + 1] = nums[i];
                unique_index += 1;
            }
        }

        return unique_index+1;
    }
}