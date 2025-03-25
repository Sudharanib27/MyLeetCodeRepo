import java.util.HashSet;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> unique_numbers = new HashSet<>();

        for (int i=0; i < nums.length; i++) {
            if (unique_numbers.contains(nums[i])) {
                return true;
            }
            unique_numbers.add(nums[i]);
        }

        return false;
    }
}