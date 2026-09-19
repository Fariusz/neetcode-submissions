class Solution {
    public boolean isPalindrome(String s) {
        String palindrome = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] palindromeChars = palindrome.toCharArray();

        int left = 0;
        int j = palindrome.length() - 1;

        while (left < j) {
            if (palindromeChars[left] != palindromeChars[j]) {
                return false;
            }
            left++;
            j--;
        }

        return true;
    }
}
