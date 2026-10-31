class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         Map<String, List<String>> groups = new HashMap<>();

        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);

            String sortedStr = new String(charArray);

            List<String> currentList = groups.getOrDefault(sortedStr, new ArrayList<>());
            currentList.add(str);

            groups.put(sortedStr, currentList);
        }
        return groups.values().stream().toList();
    }
}
