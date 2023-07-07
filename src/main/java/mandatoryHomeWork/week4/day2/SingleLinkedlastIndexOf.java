package mandatoryHomeWork.week4.day2;

public class SingleLinkedlastIndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SLL1 ll = new SLL1();
		ll.add("5");
		ll.add("7");
		ll.add("5");
		ll.add("5");
		System.out.println(ll.lastIndexOf("5"));
		//System.out.println(ll.get(-1));
		System.out.println(ll);
	}
}

class SLL1 {
	class Node {
		String data = null;
		Node next = null;
	}

	Node start = null;
	int size = 0;

	void add(String data) {
		Node node = new Node();
		node.data = data;
		if (start == null) {
			start = node;
		} else {
			Node current = start;
			while (current.next != null) {
				current = current.next;
			}
			current.next = node;
		}
		size++;
	}

	public int lastIndexOf(String item) {

		int refIndex = 0;
		int lastIndex = -1;
		Node current = start;

		// While we haven't reached the end of the list
		while (current != null) {
			// If the items are equal return the index
			if (current.data.equals(item)) {
				lastIndex = refIndex;
			}
			// Set current to the next and increment the index
			current = current.next;
			refIndex++;
		}
		return lastIndex;

	}

	public void addAll(SLL1 newll) {
		Node node = newll.start;
		while (node != null) {
			add(node.data);
			node = node.next;
		}
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		Node current = start;
		while (current != null) {
			sb.append(current.data + ", ");
			current = current.next;
		}
		sb.append("] --> " + size);
		return sb.toString();
	}
}
