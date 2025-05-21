class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> charSeen = new HashSet<>();
        int left = 0;
        int max_length = 0;
        for(int right=0; right < s.length(); right++) {
            while(!charSeen.add(s.charAt(right))) {
                charSeen.remove(s.charAt(left));
                left++;
            }
            charSeen.add(s.charAt(right));
            max_length = Math.max(max_length, right-left+1);
        }
        return max_length;
    }
}