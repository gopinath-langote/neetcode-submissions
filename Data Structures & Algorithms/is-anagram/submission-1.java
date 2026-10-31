class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) {
            return false;
        }

        int[] counts = new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

        for(int i = 0; i < s.length(); i++) {
            int position1 = s.charAt(i) - 97;
            counts[position1] = counts[position1] + 1;

            int position2 = t.charAt(i) - 97;
            counts[position2] = counts[position2] - 1;
        }

        for(int i =0; i < counts.length; i++) {
            if(counts[i] != 0) {
                return false;
            }
        }

        return true;
    }
    
}
