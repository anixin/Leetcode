class Solution {
    public int longestPalindrome(String s) {
        if(s.length() == 1) return 1;
        Set<Character> set = new HashSet<>();

        for(Character c : s.toCharArray()) {
            if(set.contains(c)) {
                set.remove(c);
            } else {
                set.add(c);
            }
        }

        if(set.size() == 0) return s.length();
        return s.length() - set.size() +1;
    }
}