class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> charFreqS = new HashMap<>();
        Map<Character, Integer> charFreqT = new HashMap<>();

        for (int i = 0; i < s.length(); i++)
        {
            if (!charFreqS.containsKey(s.charAt(i))) {
                charFreqS.put(s.charAt(i), 1);
            } else {
                charFreqS.put(s.charAt(i), charFreqS.get(s.charAt(i)) + 1);
            }

            if (!charFreqT.containsKey(t.charAt(i))) {
                charFreqT.put(t.charAt(i), 1);
            } else {
                charFreqT.put(t.charAt(i), charFreqT.get(t.charAt(i)) + 1);
            }
        }

        return charFreqS.equals(charFreqT);
    }
}