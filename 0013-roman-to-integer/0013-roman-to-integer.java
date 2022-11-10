class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        if (s.length() == 1)
            return map.get(s.charAt(0));

        int val = 0;
        int i = s.length() - 1;
        for (i = s.length() - 1; i > 0; i--) {
            Character c = s.charAt(i);
            Character ce = s.charAt(i - 1);
            if (map.get(ce) >= map.get(c)) {
                val += map.get(c);
            } else {
                val += map.get(c) - map.get(ce);
                i--;
            }
        }
        if (i == 0)
            val += map.get(s.charAt(0));

        return val;
    }
}