public class MainMaxContigSubArraySum {
    public static void main(String[] args) {
        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};

        MaxContigSubArraySum MaxSum = new MaxContigSubArraySum();
        int b = MaxSum.maxSubArray(nums);
        System.out.println(b);

        DynamicMaxContigSubArraySum DinaMaxSum = new DynamicMaxContigSubArraySum();
        int d = DinaMaxSum.dynamicSubSumArray(nums);
        System.out.println(d);

    }
}
