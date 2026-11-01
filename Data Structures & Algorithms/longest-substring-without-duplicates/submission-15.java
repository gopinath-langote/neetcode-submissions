class Solution {
    public int lengthOfLongestSubstring(String s) {
int left = 0, right = 0, result = 0;
        Set<Character> window = new HashSet<>();

        for (left = 0; right < s.length(); ) {
            char c = s.charAt(right);

            if (window.contains(c)) {
                while (window.contains(c)) {
                    window.remove(s.charAt(left));
                    left++;
                }
            }
            window.add(c);
            right++;
            result = Math.max(result, right - left);
        }

        return Math.max(result, right - left);
    }
}
