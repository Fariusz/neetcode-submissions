class Solution {
    public int minMeetingRooms(List<Interval> intervals) {

        // time -> number of meetings at that time
        Map<Integer, Integer> busyTime = new HashMap<>();

        int maxConcurrentMeetings = 0;

        for (Interval newMeeting : intervals) {

            // Check every time unit occupied by the meeting
            for (int i = newMeeting.start; i < newMeeting.end; i++) {

                // Increase number of meetings at time i
                int concurrentMeetings = busyTime.getOrDefault(i, 0) + 1;

                busyTime.put(i, concurrentMeetings);

                // Track maximum meetings happening at the same time
                maxConcurrentMeetings =
                    Math.max(maxConcurrentMeetings, concurrentMeetings);
            }
        }

        return maxConcurrentMeetings;
    }
}