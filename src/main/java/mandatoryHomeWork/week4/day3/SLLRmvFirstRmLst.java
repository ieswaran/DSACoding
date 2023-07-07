package mandatoryHomeWork.week4.day3;

public class SLLRmvFirstRmLst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SLL2 ll = new SLL2();
		ll.add("2");
		ll.add("7");
		ll.add("5");
		ll.add("10");
		ll.removeFirst();
		ll.removeFirst();
		ll.removeFirst();
		//System.out.println(ll.get(-1));
		System.out.println(ll);
	}
}

class SLL2 {
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


	public void removeFirst() {
		if (start == null) {
			System.out.println("List is empty");
		} else {
			Node next = start.next;
			start = next;
		}
	}

	public void removeLast() {
		if (start == null) {
			System.out.println("List is empty");
		}
		Node current = start;
		Node previous = null;
		int index = 0;
		while (index < size && current.next != null) {
			previous = current;
			current = current.next;
			index++;
		}
		previous.next = null;
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
		sb.append("]");
		//sb.append("] --> " + size);
		return sb.toString();
	}

}
