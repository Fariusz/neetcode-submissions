class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        Set<Integer> busyTime = new HashSet<>();

        for (Interval newMeeting : intervals) {
            for (int i = newMeeting.start; i < newMeeting.end; i++) {
                if (busyTime.contains(i)) {
                    return false;
                }
                busyTime.add(i);
            }
        }

        return true;
    }
}
