package mandatoryHomeWork.week4.day1;

import org.junit.Test;

public class MergeSortedLists {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    @Test
    public void testMergeTwoLists1() {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode listNode = mergeTwoLists(l1, l2);
        System.out.println("List output1:  " + listNode);

    }

    @Test
    public void testMergeTwoLists2() {
        ListNode l1 = null;

        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode listNode = mergeTwoLists(l1, l2);
        System.out.println("List output2: " + listNode);
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        // Create a sentinal/dummy node to start
        ListNode returnNode = new ListNode(Integer.MIN_VALUE);

        // Create a copy of this node to iterate while solving the problem
        ListNode headNode = returnNode;

        // Traverse till one of the list reaches the end
        while (l1 != null && l2 != null) {

            // Compare the 2 values of lists
            if (l1.val <= l2.val) {
                returnNode.next = l1;
                l1 = l1.next;
            } else {
                returnNode.next = l2;
                l2 = l2.next;
            }
            returnNode = returnNode.next;
        }

        // Append the remaining list
        if (l1 == null) {
            returnNode.next = l2;
        } else if (l2 == null) {
            returnNode.next = l1;
        }

        // return the next node to sentinal node
        return headNode.next;
    }
}