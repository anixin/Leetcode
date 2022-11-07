class Solution {
    public String addBinary(String a, String b) {

        StringBuilder res = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;

        Map<Character, Integer> map = new HashMap<>();
        map.put('0', 0);
        map.put('1', 1);

        int carry = 0;

        while (i >= 0 && j >= 0) {
            Integer ca = map.get(a.charAt(i));
            Integer cb = map.get(b.charAt(j));
            int val = ca + cb + carry;
            if (val < 2) {
                res.append(val);
                carry = 0;
            } else if (val == 2) {
                res.append(0);
                carry = 1;
            } else {
                res.append(1);
                carry = 1;
            }

            i--;
            j--;

        }
        while (i >= 0) {
            Integer ca = map.get(a.charAt(i));
            if (ca + carry < 2) {
                res.append(ca + carry);
                carry = 0;
            } else if (ca + carry == 2) {
                res.append(0);
                carry = 1;
            } else {
                res.append(1);
                carry = 1;
            }
            i--;
        }

        while (j >= 0) {
            Integer ca = map.get(b.charAt(j));
            if (ca + carry < 2) {
                res.append(ca + carry);
                carry = 0;
            } else if (ca + carry == 2) {
                res.append(0);
                carry = 1;
            } else {
                res.append(1);
                carry = 1;
            }
            j--;
        }
        if (carry == 1) {
            res.append(1);
        }

        return res.reverse().toString();
    }
}