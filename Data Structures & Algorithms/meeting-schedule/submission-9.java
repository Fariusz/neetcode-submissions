class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {

        int maxEnd = 0;

        for (Interval meeting : intervals) {
            maxEnd = Math.max(maxEnd, meeting.end);
        }

        boolean[] busyTime = new boolean[maxEnd];

        for (Interval newMeeting : intervals) {
            for (int i = newMeeting.start; i < newMeeting.end; i++) {

                if (busyTime[i] == false) {
                    busyTime[i] = true;
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}
