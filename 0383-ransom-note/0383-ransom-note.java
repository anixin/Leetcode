class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        Map<Character, Integer> map = new HashMap<>();

        for (Character c : magazine.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (Character c : ransomNote.toCharArray()) {
            if (!map.containsKey(c))
                return false;
            else {
                map.put(c, map.get(c) - 1);
                if (map.get(c) == 0)
                    map.remove(c);
            }
        }

        return true;
    }
}