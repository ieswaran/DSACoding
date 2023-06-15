package Week4.Day3;

import Week4.Day2.deleteDuplicate;
import org.junit.Test;

public class RemoveDuplicate {
    public class ListNode {
      int val;
      ListNode next;
     ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    @Test
    void testRemoveElements1() {
        ListNode head = new ListNode(4);
        head.next = new ListNode(6);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(9);
        head.next.next.next.next.next = new ListNode(6);

        int val = 6;

        ListNode actual = removeElements(head, val);
    }
        public ListNode removeElements(ListNode head, int val) {

        // Create a dummy head node
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode curr = dummy;
        while (curr.next != null) {

            // Check if the value matches
            if (curr.next.val == val)
                curr.next = curr.next.next;
            else
                curr = curr.next;
        }

        // Return the head
        return dummy.next;
    }
}
