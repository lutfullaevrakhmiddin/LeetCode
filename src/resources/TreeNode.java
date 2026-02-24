package resources;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) { val = x; }

    public TreeNode(Integer[] nums) {
        if (nums == null || nums.length == 0) return;

        this.val = nums[0];
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(this);

        int i = 1;
        while (i < nums.length) {
            TreeNode current = queue.poll();

            if (i < nums.length && nums[i] != null) {
                current.left = new TreeNode(nums[i]);
                queue.add(current.left);
            }
            i++;

            if (i < nums.length && nums[i] != null) {
                current.right = new TreeNode(nums[i]);
                queue.add(current.right);
            }
            i++;
        }
    }
}