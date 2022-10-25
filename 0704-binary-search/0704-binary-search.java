class Solution {
    private int searchUtil(int[] nums, int target, int l, int r) {
        int mid = (r+l)/2;

        if(l <= r) {
            if(target == nums[mid]) return mid;
            
            else if(target < nums[mid]) {
                return searchUtil(nums, target, l, mid-1);
            }
            else {
                return searchUtil(nums, target, mid+1, r);
            }
        }
        return -1;
    }

    public int search(int[] nums, int target) {
        if(nums.length == 0) return -1;
        if(nums.length == 1 && nums[0] != target) return -1;
        if(nums[0] == target) return 0;

        int l = 0;
        int r = nums.length - 1;
        return searchUtil(nums, target, l, r);

    }
}