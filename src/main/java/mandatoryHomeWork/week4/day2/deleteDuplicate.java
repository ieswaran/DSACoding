package mandatoryHomeWork.week4.day2;

import org.junit.Test;

public class deleteDuplicate {
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

    int size = 0;
    ListNode head = null, tail = null;

    public ListNode addAll(int[] input) {
        for (int value : input)
            if (head == null)
                head = tail = new ListNode(value);
            else
                tail = tail.next = new ListNode(value);
        return head;
    }

    @Test
    public void Test() {
        ListNode head = new deleteDuplicate().addAll(new int[]{1, 1, 2, 3});
        ListNode newHead = deleteDuplicates(head);
        System.out.println(newHead.toString());
       print(newHead);
    }
    private void print(ListNode node){
        while(node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode prev = head;
        ListNode temp = prev.next;

        while (temp != null) {
            if (temp.val == prev.val) {
                temp = temp.next;
            }
            prev.next=temp;
            prev=temp;
            temp=temp.next;
        }
        prev.next=null;
        return head;
    }

    @Override
    public String toString () {
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        ListNode current = head;
        while (current != null) {
            sb.append(current.val + ", ");
            current = current.next;
        }
        sb.append("] --> " + size);
        return sb.toString();
    }


}
