class Solution {
    public int lengthOfLongestSubstring(String s) {
int result = 0;
        String longestSubstring = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (longestSubstring.contains("" + c)) {
                longestSubstring = longestSubstring.substring(longestSubstring.indexOf(c) + 1);
            }
            longestSubstring = longestSubstring.concat("" + c);
            result = Math.max(longestSubstring.length(), result);
        }
        result = Math.max(longestSubstring.length(), result);

        return result;
    }
}
