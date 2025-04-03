import java.util.Hashtable;

class Solution {
    public int[] twoSum(int[] nums, int target) {
       Hashtable<Integer, Integer> numbers = new Hashtable<>();
       for (int i=0; i < nums.length; i++) {
        if (numbers.containsKey(target - nums[i])) {
            return new int[] {numbers.get(target - nums[i]), i};
        }
        numbers.put(nums[i], i);
       }
       return null;
    }
}