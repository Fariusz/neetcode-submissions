class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        List<Character> listS = new ArrayList();
        List<Character> listT = new ArrayList();

        for (int i = 0; i < s.length(); i++) {
            listS.add(s.charAt(i));
            listT.add(t.charAt(i));
        }

        listS.sort(Comparator.naturalOrder());
        listT.sort(Comparator.naturalOrder());

        if (listS.equals(listT)) {
            return true;
        } else {
            return false;
        }
    }
}
