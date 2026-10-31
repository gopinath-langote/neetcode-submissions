class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> expected = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int expectedN = target - nums[i];

            if(expected.containsKey(expectedN)) {
                return new int[]{expected.get(expectedN), i};
            }
            
            expected.put(nums[i], i);

        }
        return new int[]{};
    }

}
