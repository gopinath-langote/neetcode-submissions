class Solution {
    public boolean isAnagram(String s, String t) {

        char[] sChars = s.toCharArray();
        Arrays.sort(sChars);

        char[] tChars = t.toCharArray();
        Arrays.sort(tChars);

        String s1 = new String(sChars);
        String t1 = new String(tChars);

        return s1.equals(t1);
    }
}
