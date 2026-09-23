class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> charSet = new HashSet<>();
        char[] charArray = s.toCharArray();

        int l = 0;
        int p = 0;

        int max = 0;

        while (p < charArray.length) {
            if (!charSet.contains(charArray[p])) {
                charSet.add(charArray[p]);
                max = Math.max(max, p - l + 1);
                p++;
            } else {
                charSet.remove(charArray[l]);
                l++;
            }
        }

        return max;
    }
}
