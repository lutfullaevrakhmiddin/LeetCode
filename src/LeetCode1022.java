import resources.TreeNode;

public class LeetCode1022 {
    public static void main(String[] args) {
        Integer[] nums = {1, 0, 1, 0, 1, 0, 1};
        TreeNode node = new TreeNode(nums);
        System.out.println(sumRootToLeaf(node));

    }
    public static int sumRootToLeaf(TreeNode root) {
        return sumRootToLeaf2(root, 0);
    }

    private static int sumRootToLeaf2(TreeNode root, int curSum) {
        if (root == null) return 0;
        curSum = curSum * 2  + root.val;
        if (root.left == null && root.right == null) return curSum;
        int leftSum = sumRootToLeaf2(root.left, curSum);
        int rightSum = sumRootToLeaf2(root.right, curSum);
        return leftSum + rightSum;
    }
}
