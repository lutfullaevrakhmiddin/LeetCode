import java.util.Arrays;

public class LeetCode283 {
    public static void main(String[] args) {
        int[]  nums = {0,1,0,3,12};
        moveZeroes(nums);
        moveZeroes2(nums);
    }

    public static void moveZeroes(int[] nums) {
        int[] cloneNums = new int[nums.length];
        int i = 0;
        for (int n : nums) if (n != 0) cloneNums[i++] = n;
        System.arraycopy(cloneNums, 0, nums, 0, nums.length);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes2(int[] nums) {
        int lastElement = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[lastElement++] = nums[i];
            }
        }
        for (int i = lastElement; i < nums.length; i++) {
            nums[i] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }
}
