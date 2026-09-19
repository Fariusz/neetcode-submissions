class Solution {
    public boolean isPalindrome(String s) {
        String palindrome = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] palindromeChars = palindrome.toCharArray();

        int i = 0;
        int j = palindrome.length() - 1;

        while (i < j) {
            if (palindromeChars[i] != palindromeChars[j]) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
