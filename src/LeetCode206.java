import resources.ListNode;

public class LeetCode206 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, -4, 5};
        ListNode head = new ListNode(nums);
        System.out.println(head.print());

        ListNode reversed = reverseList(head);
        System.out.println(reversed.print());
    }
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}