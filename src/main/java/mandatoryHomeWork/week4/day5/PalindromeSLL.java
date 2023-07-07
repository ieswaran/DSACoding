package mandatoryHomeWork.week4.day5;

public class PalindromeSLL {

	public static void main(String[] args) {
		ListNode n9 = new ListNode(1, null);
		ListNode n8 = new ListNode(1, null);
		ListNode n7 = new ListNode(7, null);
		ListNode n6 = new ListNode(6, null);
		ListNode n5 = new ListNode(5, n6);
		ListNode n4 = new ListNode(4, n5);
		ListNode n3 = new ListNode(3, n4);
		ListNode n2 = new ListNode(2, n3);
		ListNode ll1 = new ListNode(1, n2);
		System.out.println("check ll: ");
		displayAll(ll1);
		boolean cReverseLL = halfMethod(ll1);
		System.out.println(cReverseLL);
	}

	public static class ListNode {
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

	public static boolean halfMethod(ListNode head) {

		ListNode tem = head;
		ListNode secondLL = new ListNode();
		ListNode p = head;
		ListNode q = head;
		if (tem.next == null) {
			return true;
		}

		while (true) {
			// System.out.println("check p val: "+p.val+"->"+p.next.next.val);
			p = p.next.next;
			// System.out.println("check: "+p.val+"->"+p.next.val);
			if (p == null) {
				secondLL = q.next;
				break;
			}
			if (p.next == null) {
				secondLL = q.next.next;
				break;
			}

			// System.out.println("check q val: "+q.val+"->"+q.next.val);
			q = q.next;
		}
		// System.out.println("check q.next val becomes: "+q.next.val+"->null");
		q.next = null;
		// System.out.println("secondLL:");
		// displayAll(secondLL);
		// System.out.println("firstLL:");
		// displayAll(head);
		ListNode reverse = reverse(secondLL);
		// System.out.println("reverse:");
		// displayAll(reverse);

		while (reverse != null && head != null) {
			if (reverse.val != head.val) {
				System.out.println("not pal");
				return false;
			}
			// System.out.println(reverse.val + "||" + head.val);
			reverse = reverse.next;
			head = head.next;
		}

		return true;
	}

	public static ListNode reverse(ListNode head) {
		ListNode prev = null;
		ListNode cur = head;
		ListNode nxt = cur.next;
		while (cur != null) {

			cur.next = prev;
			prev = cur;
			cur = nxt;
			if (nxt != null) {
				nxt = nxt.next;
			}

		}
		// displayAll(head);
		return prev;

	}

	public static void displayAll(ListNode l) {
		ListNode temp = new ListNode();
		temp = l;
		System.out.print("[ ");
		while (temp != null) {
			System.out.print(temp.val + ", ");
			temp = temp.next;
		}
		System.out.print("Null ]");
		System.out.println();

	}

}
