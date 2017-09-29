class Solution {
    public boolean checkPossibility(int[] nums) {
        int modified = 0;
        for (int i = 1, prev = nums[0]; i < nums.length; i++) {
            if (nums[i] < prev) {
                if (modified++ > 0) return false;
                if (i - 2 >= 0 && nums[i - 2] > nums[i]) continue;
            }
            prev = nums[i];
        }
        return true;
    }
}
