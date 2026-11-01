class Solution {
    public int findMin(int[] nums) {
        int[] sortedNums = new int[nums.length];
        int startPoint = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[startPoint]) {
                startPoint = i;
            }
        }
        int j = 0;
        for (int i = startPoint; i < nums.length; i++) {
            sortedNums[j] = nums[i];
            j++;
        }
        for (int i = 0; i < startPoint; i++) {
            sortedNums[j] = nums[i];
            j++;
        }

        return sortedNums[0];
    }
}
