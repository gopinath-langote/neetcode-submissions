class Solution {
public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;

        while (l <= r) {
            int mid = (l + r) / 2;
            if (target == nums[mid]) {
                return mid;
            }
            if (mid == l) {
                if (nums[l] == target) {
                    return l;
                }
                if (nums[r] == target) {
                    return r;
                }
                break;
            }
            if (nums[l] < nums[mid]) {
                if (target >= nums[l] && target <= nums[mid]) {
                    r = mid;
                } else {
                    l = mid;
                }
            } else {
                if (target >= nums[mid] && target <= nums[r]) {
                    l = mid;
                } else {
                    r = mid;
                }
            }
        }
        return -1;
}
}
