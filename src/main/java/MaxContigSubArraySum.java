public class MaxContigSubArraySum {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int maximumSubArraySum = Integer.MIN_VALUE;

        for (int left = 0; left < n; left++) {
            int runningWindowSum = 0;
            for (int right = left; right < n; right++) {
                runningWindowSum += nums[right];
                maximumSubArraySum = Math.max(maximumSubArraySum, runningWindowSum);
            }
        }
        return maximumSubArraySum;
    }
}
