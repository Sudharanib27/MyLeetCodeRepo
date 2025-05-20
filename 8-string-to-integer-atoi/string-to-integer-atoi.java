class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        int i = 0;
        int result = 0;
        int sign = 1;

        if(s.length() == 0) {
            return 0;
        }

        if (s.charAt(0) == '-') {
            sign = -1;
            i++;
        }
        else if (s.charAt(0) == '+') {
            i++;
        }

        while ( i < s.length()) {
            char ch = s.charAt(i);
            if (ch < '0' || ch > '9') {
                break;
            }

            if (result > (Integer.MAX_VALUE - (ch - '0')) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = (result * 10) + (ch - '0');
            
            i++;
        }

        return (int) (result * sign);
    }
}