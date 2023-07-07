package mandatoryHomeWork.week4.day1;

public class SingleLinkedListGetIndexImp {
	public static void main(String[] args) {
		SLL ll = new SLL();
		ll.add("5");
		ll.add("23");
		ll.add("7");
		ll.add("13");
		System.out.println(ll.indexOf("7"));
		System.out.println(ll.get(-1));
		System.out.println(ll);
	}
}


class SLL {
	class Node {
		String data = null;
		Node next = null;
	}


	Node start = null;
	int size = 0;
	void add (String data) {
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
		size ++;
	}


	public int indexOf(String item) {   


		int index = 0;
		Node current = start;


		//While we haven't reached the end of the list
		while(current != null) {
			//If the items are equal return the index
			if(current.data.equals(item)) {
				return index;           
			}
			//Set current to the next and increment the index  
			current = current.next;
			index++;
		}
		return -1;
	}


	@Override
	public String toString () {
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


	public String get(int getIndex){
		int index1=0;
		Node current = start;
		if(getIndex<size && getIndex >0) {
			if(index1==getIndex) {
				return current.data;
			}
			else {
				while(index1!=getIndex) {
					current = current.next;
					index1++;
				}
				return current.data;
			}
		}
		else {
			return "OutOfIndexException";
		}


	}

}
