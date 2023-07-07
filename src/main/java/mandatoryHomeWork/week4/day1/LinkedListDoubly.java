package mandatoryHomeWork.week4.day1;


public class LinkedListDoubly {



	class Node {
		String data = null;
		Node next = null;
		Node prev = null;

		public Node() {

		}

	}
	Node start = null;
	int size = 0;
	
	void insert(int index, String data) {
		Node node = new Node();
		node.data=data;
		int count=0;
		Node current=start;
		if(index==1) {
			node.next=start;
			start.prev=node;
			start=node;
			size++;
		}
		while (count<index-1) {
			current=current.next;
			count++;
		}
		node.next=current.next;
		node.prev=current;
		current.next.prev=node;
		current.next=node;
		size++;
	}

	void delete(String data) {
		Node current = start;
		if (start != null && start.data.equals(data)) {
			start = start.next;
			if(start!=null) {
				
			}
			size--;
		}
		if (start == null || start.next == null) {
			return;
		}
		
		while (current != null) {
			if (current.data.equals(data)) {
				current.prev.next=current.next;
				current.next.prev=current.prev;
				current.prev=null;
				size--;
			}
			current = current.next;
		}
	}

	
}
