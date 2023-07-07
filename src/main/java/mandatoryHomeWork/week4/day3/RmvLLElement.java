package mandatoryHomeWork.week4.day3;
/*Pseudocode :
 *  1. add the input in a linked list
 *  2. then create a method to remvoe the mentioned value
 *  3. if the value at the start of hte LL
 *  	then put start = null
 *  4. else if the value presend in the mid
 *  	then assign the current.previous.next = current.next
 *  5 .else if the val is present at the end
 *  	then dont assign current.next.previous = current.previous;*/ 
 public class RmvLLElement {
	public static void main(String[] args) {
		Dl dl = new Dl();
		dl.add("1");
		dl.add("2");
		dl.add("6");
		dl.add("3");
		dl.add("4");
		dl.add("5");
		dl.add("6");
		
		dl.Con("6");
		dl.Con("6");
		System.out.println(dl);
	}
}

class Dl {
	class Node {
		String data = null;
		Node next = null;
		Node previous = null;
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
			node.previous = current;
		}
		size++;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		Node current = start;
		while (current != null) {
			sb.append(current.data + "(" + (current.previous != null ? current.previous.data : null) + ","
					+ (current.next != null ? current.next.data : null) + ")");
			current = current.next;
			if (current != null) {
				sb.append(", ");
			}
		}
		sb.append("] --> " + size);
		return sb.toString();
	}

	void Con(String val) {
		if (start.data == val) {
			if (size == 1) {
				start = null;
			} else {
				start = start.next;
				start.previous = null;
			}
		}else {
			Node current = start.next;
			while (current.data != val) {
				current = current.next;
			}
			current.previous.next = current.next;
			if(current.next != null) {
				current.next.previous = current.previous;
			}
		}
	}
}
