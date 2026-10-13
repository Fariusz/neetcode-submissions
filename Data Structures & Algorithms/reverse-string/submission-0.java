class Solution {
    public void reverseString(char[] s) {

        int p1 = s.length -1;
        int p2 = 0;

        while(p1 >= p2){
            char temp = s[p1];
            s[p1] = s[p2];
            s[p2] = temp;

            p1--;
            p2++;
        }
    }
}