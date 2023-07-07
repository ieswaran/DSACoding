package mandatoryHomeWork.week4.day3;
public class RmvDuplicate {
	public static void main(String[] args) {
		DoublyLL dl = new DoublyLL();
		dl.add("1");
		dl.add("1");
		dl.add("2");
		dl.add("2");
		dl.add("3");
		dl.add("3");
		System.out.println(dl);
	}
}

class DoublyLL {
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
		Node current = start;
		if (start == null) {
			start = node;
		}	
		else {
			current = start;
			while (current.next != null) {
				current = current.next;
			}
			if(current.data == node.data) {
				current.next = null;
			}else {
			current.next = node;
			node.previous = current;
			}
		}
		size++;
	}
	 @Override
	  public String toString () {
	    StringBuffer sb = new StringBuffer();
	    sb.append("[");
	    Node current = start;
	    while (current != null) {
	      sb.append(current.data + "(" + (current.previous != null ? current.previous.data : null) + "," + (current.next != null ? current.next.data : null) + ")");
	      current = current.next;
	      if(current != null) {
	        sb.append(", ");
	      }
	    }
	    sb.append("] --> " + size);
	    return sb.toString();
	  }

}
