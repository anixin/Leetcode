class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length == 1) return nums[0];
        int mid = nums.length/2;
        Map<Integer, Integer> map = new HashMap<>();

        for (Integer i : nums) {
            if(map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            }   else {
                map.put(i, 1);
            }
            if(map.get(i) > mid) return i;
        }
        return -1;
    }
}