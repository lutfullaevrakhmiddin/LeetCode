import resources.ListNode;

public class LeetCode141 {
    public static void main(String[] args) {
        int[] nums= {3,2,0,4};
        ListNode listNode = new ListNode(nums);
        System.out.println(hasCycle(listNode));
    }

    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        return true;
    }
}