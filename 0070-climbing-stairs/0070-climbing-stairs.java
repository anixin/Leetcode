class Solution {
    public int climbStairs(int n) {
        int first = 0;
        int second = 1;

        int sum  = 1;

        for ( int i = 0; i < n; i++) {
            sum = first + second;
            first = second;
            second = sum;
        }

        return sum;
    }
}