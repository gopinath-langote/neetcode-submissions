class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> counts = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            char fc = s.charAt(i);
            char sc = t.charAt(i);

            counts.put(fc, counts.getOrDefault(fc, 0) + 1);
            if(counts.get(fc) == 0) {
                counts.remove(fc);
            }
            
            counts.put(sc, counts.getOrDefault(sc, 0) - 1);
            if(counts.get(sc) == 0) {
                counts.remove(sc);
            }
        }

        return counts.size() == 0;
    }
    
}
