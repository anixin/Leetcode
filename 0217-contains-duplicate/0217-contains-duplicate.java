class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(Integer i : nums) {
            if(!set.contains(i))    {
                set.add(i);
            }   else {
                return true;
            }
        }
        return false;
    }
}