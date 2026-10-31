class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> appearedSet = new HashSet<>();

        for (int num : nums) {
            boolean added = appearedSet.add(num);
            if (!added) {
                return true;
            }
        }

        return false;
    }
}