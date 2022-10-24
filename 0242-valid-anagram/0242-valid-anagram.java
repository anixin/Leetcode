class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()) return false;

        Map<Character, Integer> map = new HashMap<>();

        for (Character c: s.toCharArray()) {
            if(!map.containsKey(c)) {
                map.put(c, 1);
            }   else {
                map.put(c, map.get(c) + 1);
            }
        }

        for (Character c : t.toCharArray()) {
            if(!map.containsKey(c)) return false;

            map.put(c, map.get(c) - 1);
            if(map.get(c) == 0) {
                map.remove(c);
            }

        }

        return true;
    }
}