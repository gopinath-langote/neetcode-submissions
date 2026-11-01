class Solution {
    public int findMin(int[] nums) {
        if (nums[0] < nums[nums.length - 1]) {
            return nums[0];
        }
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] > nums[mid + 1]) {
                return nums[mid + 1];
            }
            if (nums[mid] < nums[right]) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return nums[0];
    }
}
