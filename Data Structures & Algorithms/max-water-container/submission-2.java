class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0;
        int start = 0;
        int end = heights.length - 1;
        while (start < end) {
            int currentArea = Math.min(heights[start], heights[end]) * (end - start);
            if (currentArea > maxArea) {
                maxArea = currentArea;
            }
            if (heights[start] <= heights[end]) {
                start++;
            } else {
                end--;
            }
        }
        return maxArea;
    }
}
