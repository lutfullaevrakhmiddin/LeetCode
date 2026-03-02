public class LeetCode53 {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,5,-4};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums) {
            int prefixSum = 0;
            int minPrefix = 0;
            int maxSum = nums[0];

            for(int num : nums) {
                prefixSum += num;
                maxSum = Math.max(maxSum, prefixSum - minPrefix);
                minPrefix = Math.min(minPrefix, prefixSum);
            }

            return maxSum;
    }
}
