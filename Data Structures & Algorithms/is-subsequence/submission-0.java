class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0; //Pointer dla S
        int j = 0; //Pointer dla T

        while (i < s.length() && j < t.length()){

            if (s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        }
        return i == s.length();
    }
}