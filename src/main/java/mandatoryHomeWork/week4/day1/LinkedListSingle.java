package mandatoryHomeWork.week4.day1;
public class LinkedListSingle {
	public static void main(String[] args) {

		LinkedListSingle ll = new LinkedListSingle();
		ll.add(1);
		ll.add(2);
		ll.add(3);

		ll.add(4);
		ll.add(5);
		ll.add(6);
		ll.display();

		ll.insert(3, 100);
		ll.display();
		int i = ll.get(3);
		System.out.println(ll.indexOf(3));
		System.out.println(i);
		ll.delete(100);
		System.out.println(ll.indexOf(3));
		ll.display();

		int i1 = ll.get(3);
		System.out.println(i1);
	}

	class Node {
		int data;
		Node next = null;

		public Node() {

		}

		public Node(int data) {
			this.data = data;
		}

		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}

	}

	Node start = null;
	int size = 0;

	// add value at the end
	void add(int data) {
		Node node = new Node(data);
		if (start == null) {
			start = node;
		} else {
			Node current = start;
			while (current.next != null) {
				current = current.next;
			}
			current.next = node;
			size++;
		}
	}

	void insert(int pos, int data) {
		int index = pos;
		Node node = new Node();
		node.data = data;
		int count = 1;
		Node current = start;
		if (index == 1) {
			node.next = start;
			start = node;
			size++;
			return;
		}
		while (count < index--) {
			// System.out.println("inside while "+index);
			current = current.next;
			count++;
			// System.out.println("count:"+count);
		}
		node.next = current.next;
		current.next = node;
		size++;

	}

	void delete(int data) {
		if (start != null && start.data == (data)) {
			start = start.next;
			size--;
		}
		if (start == null || start.next == null) {
			return;
		}
		Node current = start.next;
		Node prev = start;
		while (current != null) {
			if (current.data == (data)) {
				prev.next = current.next;
				size--;
			}
			prev = current;
			current = current.next;
		}
	}

	int get(int i) {
		Node temp = new Node();
		temp = start;
		int ans = -1;
		int count = 1;
		while (temp != null) {
			if (i == count) {
				ans = temp.data;
				return ans;
			}
			count++;
			temp = temp.next;
		}

		return ans;
	}

	int indexOf(int element) {
		Node temp = new Node();
		temp = start;
		int ans = -1;
		int count = 1;
		while (temp != null) {
			if (temp.data == element) {
				ans = count;
				return ans;
			}
			count++;
			temp = temp.next;
		}

		return ans;

	}

	// Display the linked list
	void display() {
		Node temp = new Node();
		temp = start;
		System.out.print("[ ");
		while (temp != null) {
			System.out.print(temp.data + ", ");
			temp = temp.next;
		}
		System.out.print("Null ]");
		System.out.println("Size: " + (size + 1));
	}

}