class Solution {
    public int findMin(int[] nums) {
        int min = nums[0];
        for (int num : nums) {
            min = Math.min(num, min);
        }
        return min;
    }
}
