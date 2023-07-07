package mandatoryHomeWork.week4.day1;

/* Java program to merge two
sorted linked lists */

/* Link list node */
class Packet {
	int data;
	Packet next;
	Packet(int d)
	{
		data = d;
		next = null;
	}
}

class MergeLists {
	Packet head;

	/* Method to insert a node at
	the end of the linked list */
	public void addToTheLast(Packet node)
	{
		if (head == null) {
			head = node;
		}
		else {
			Packet temp = head;
			while (temp.next != null)
				temp = temp.next;
			temp.next = node;
		}
	}

	/* Method to print linked list */
	void printList()
	{
		Packet temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	// Driver Code
	public static void main(String args[])
	{
		/* Let us create two sorted linked
		lists to test the methods
		Created lists:
			llist1: 5->10->15,
			llist2: 2->3->20
		*/
		MergeLists llist1 = new MergeLists();
		MergeLists llist2 = new MergeLists();

		// Node head1 = new Node(5);
		llist1.addToTheLast(new Packet(5));
		llist1.addToTheLast(new Packet(10));
		llist1.addToTheLast(new Packet(15));

		// Node head2 = new Node(2);
		llist2.addToTheLast(new Packet(2));
		llist2.addToTheLast(new Packet(3));
		llist2.addToTheLast(new Packet(20));

		llist1.head = new Gfg().sortedMerge(llist1.head,
											llist2.head);
		System.out.println("Merged Linked List is:");
		llist1.printList();
	}
}

class Gfg {
	/* Takes two lists sorted in
	increasing order, and splices
	their nodes together to make
	one big sorted list which is
	returned. */
	Packet sortedMerge(Packet headA, Packet headB)
	{

		/* a dummy first node to
		hang the result on */
		Packet dummyNode = new Packet(0);

		/* tail points to the
		last result node */
		Packet tail = dummyNode;
		while (true) {

			/* if either list runs out,
			use the other list */
			if (headA == null) {
				tail.next = headB;
				break;
			}
			if (headB == null) {
				tail.next = headA;
				break;
			}

			/* Compare the data of the two
			lists whichever lists' data is
			smaller, append it into tail and
			advance the head to the next Node
			*/
			if (headA.data <= headB.data) {
				tail.next = headA;
				headA = headA.next;
			}
			else {
				tail.next = headB;
				headB = headB.next;
			}

			/* Advance the tail */
			tail = tail.next;
		}
		return dummyNode.next;
	}
}



