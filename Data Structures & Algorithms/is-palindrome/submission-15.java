class Solution {
    public boolean isPalindrome(String s) {
        String palindrome = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] palindromeChars = palindrome.toCharArray();

        int left = 0;
        int right = palindrome.length() - 1;

        while (left < right) {
            if (palindromeChars[left] != palindromeChars[right]) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
