import resources.ListNode;

public class LeetCode26 {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1, 2, 3, 4, 4, 5, 5}));
    }

    public static int removeDuplicates(int[] nums) {
        int left = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[left] != nums[i]) {
                nums[++left] = nums[i];
            }
        }
        return left + 1;
    }
}
