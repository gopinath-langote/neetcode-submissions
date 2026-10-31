class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> topCounts = new TreeMap<>();

        for(int i = 0; i< nums.length; i++) {
            int currentCount = topCounts.getOrDefault(nums[i], 0);
            currentCount++;

            topCounts.put(nums[i], currentCount);
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(
                (a, b) -> topCounts.get(a) - topCounts.get(b)
        ); 

        for(int num: topCounts.keySet()) {
            minHeap.offer(num);
            if(minHeap.size() > k) {
                minHeap.poll();
            }
        }

        int[] result = new int[k];
for (int i = 0; i < k; i++) {
    result[i] = minHeap.poll();
}
return result;
    }
}
