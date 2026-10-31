class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int required = target - current;

            if (map.containsKey(required)) {
                return new int[]{map.get(required), i};
            }

            map.put(current, i);
        }

        return new int[]{};
    }
}
