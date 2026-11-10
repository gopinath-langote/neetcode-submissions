/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
  public int minMeetingRooms(List<Interval> intervals) {
        intervals.sort((o1, o2) -> o1.start - o2.start);

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (Interval interval : intervals) {
            minHeap.offer(interval.end);

            if (minHeap.peek() <= interval.start) {
                minHeap.poll();
            }
        }
        return minHeap.size();
    }

}
