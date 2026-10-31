class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();

        for(int i = 0; i < strs.length; i++) {
            String s = strs[i];

            char[] cr = s.toCharArray();
            Arrays.sort(cr);

            String sortedS = new String(cr);

            List<String> currentList = anagrams.getOrDefault(sortedS, new ArrayList<>());
            currentList.add(s);

            anagrams.put(sortedS, currentList);
        }
        
        return new ArrayList<>(anagrams.values());
    }
}
