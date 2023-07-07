package mandatoryHomeWork.week4.day1;

public class BaseBallGame {
	public static void main(String[] args) {
		DoublyLinkedList dl = new DoublyLinkedList();
		dl.add("5");
		dl.add("2");
		dl.add("C");
		dl.add("D");
		dl.add("+");
		System.out.println(dl);
		System.out.println(dl.dllSum(dl));

		DoublyLinkedList dl2 = new DoublyLinkedList();
		dl2.add("5");
		dl2.add("-2");
		dl2.add("4");
		dl2.add("C");
		dl2.add("D");
		dl2.add("9");
		dl2.add("+");
		dl2.add("+");
		System.out.println(dl2);
		System.out.println(dl2.dllSum(dl2));
	}
}

class DoublyLinkedList {
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
		} //'C'-> Invalidate the previous score, removing it from the record.
		else if (node.data == "C") {
			Node current = start;
			while (current.next != null) {
				current = current.next;
			}
			current.previous.next = null;
		}//'D'-> Record a new score that is the double of the previous score. 
		else if (node.data == "D") {
			Node current = start;
			while (current.next != null) {
				current = current.next;
			}
			String datas = current.data;
			int d = Integer.parseInt(datas);
			int multiply = d * 2;
			String mul = Integer.toString(multiply);
			current.next = node;
			node.data = mul;
			node.previous = current;
		} //'+' -> Record a new score that is the sum of the previous two scores.
		else if (node.data == "+") {
			Node current = start;
			while (current.next != null) {
				current = current.next;
			}
			String currentData = current.data;
			String prevOfCurrData = current.previous.data;
			int data1 = Integer.parseInt(currentData);
			int data2 = Integer.parseInt(prevOfCurrData);
			int sumOfLastTwo = data1 + data2;
			String sum = Integer.toString(sumOfLastTwo);
			current.next = node;
			node.data = sum;
			node.previous = current;
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
	// over all sum of the DL
	int dllSum(DoublyLinkedList dl) {
		Node current = start;
		int sum = 0;
		String currentData;
		int intData;
		while (current.next != null) {
			currentData = current.data;
			intData = Integer.parseInt(currentData);
			sum += intData;
			current = current.next;
		}
		currentData = current.data;
		intData = Integer.parseInt(currentData);
		return sum += intData;
	}
	// print the dl
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
}