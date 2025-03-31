import java.util.Hashtable;
import java.util.ArrayList;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Hashtable<Integer, Integer> nums1Map = new Hashtable<>();
        ArrayList<Integer> resultAL = new ArrayList<>();

        for (int n: nums1) {
            if (nums1Map.containsKey(n)) {
                nums1Map.put(n, nums1Map.get(n)+1);
            }
            else {
                nums1Map.put(n, 1);
            }
        }

        for (int m: nums2) {
            if (nums1Map.containsKey(m)) {
                resultAL.add(m);
                nums1Map.put(m, nums1Map.get(m) - 1);
                if (nums1Map.get(m) == 0) {
                nums1Map.remove(m);
            }
            }
        }

        int[] result = new int[resultAL.size()];
        for (int i=0; i < result.length; i++) {
            result[i] = resultAL.get(i);
        }
        
        return result;
    }
}