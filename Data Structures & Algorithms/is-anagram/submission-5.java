class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> counts = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            char fc = s.charAt(i);
            char sc = t.charAt(i);

            if(!counts.containsKey(fc)) {
                counts.put(fc, 1);
            }
            else {
                counts.put(fc, counts.get(fc) + 1);

                if(counts.get(fc) == 0) {
                    counts.remove(fc);
                }
            }

            if(!counts.containsKey(sc)) {
                counts.put(sc, -1);
            }
            else {
                counts.put(sc, counts.get(sc) - 1);

                if(counts.get(sc) == 0) {
                    counts.remove(sc);
                }
            }

            // System.out.println(counts);
        }

        return counts.size() == 0;
    }
    
}
