class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();

        for(int i = 0; i < strs.length; i++) {
            String s = strs[i];

            char[] cr = s.toCharArray();
            Arrays.sort(cr);

            String sortedS = new String(cr);

            anagrams.putIfAbsent(sortedS, new ArrayList<>());
            
            anagrams.get(sortedS).add(s);
        }
        
        return new ArrayList<>(anagrams.values());
    }
}
