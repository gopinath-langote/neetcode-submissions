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
        int length = intervals.size();
        int[] startArray = new int[length];
        int[] endArray = new int[length];
        for (int i = 0; i < intervals.size(); i++) {
            Interval interval = intervals.get(i);
            startArray[i] = interval.start;
            endArray[i] = interval.end;
        }

        Arrays.sort(startArray);
        Arrays.sort(endArray);

        int result = 0;
        int s = 0;
        int e = 0;
        int currentMeetingCount = 0;
        while (s < length) {
            if (startArray[s] < endArray[e]) {
                currentMeetingCount++;
                s++;
            } else {
                e++;
                currentMeetingCount--;
            }
            result = Math.max(result, currentMeetingCount);
        }
        return result;
    }

}
