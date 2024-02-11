class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                decreasing = false;
            } else if (nums[i] > nums[i + 1]) {
                increasing = false;
            }
        }

        // If either increasing or decreasing is true, the array is monotonic
        return increasing || decreasing;
    }
}
