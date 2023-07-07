package mandatoryHomeWork.week4.day2;

public class BksSapceStr {
	public static void main(String[] args) {
		DLL dl1 = new DLL();
		dl1.add("a");
		dl1.add("b");
		dl1.add("#");
		dl1.add("c");
		System.out.println(dl1);
		DLL dl2 = new DLL();
		dl2.add("a");
		dl2.add("d");
		dl2.add("#");
		dl2.add("c");
		System.out.println(dl2);
		
		boolean match = DLL.compare(dl1, dl2);
		System.out.println("Comparison of two list is "+match);
		
		/*
		 * DLL dl = new DLL(); boolean flag = dl.conf(dl1, dl2);
		 * System.out.println(flag); }
		 */
}
}

class DLL {
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
		} else if (node.data == "#") {
			Node current = start;
			
			while (current.next != null) {
				current = current.next;
			}
			
			if(current.previous == null) {
				start = null;
			}
			else{
			    current.previous.next = null;
			}
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

	public static boolean compare(DLL first, DLL second) {
		boolean match= false;
		if(first.start != null && second.start != null) {
			if(first.start.data.equals(second.start.data)){
				Node fN = first.start.next;
				Node sN = second.start.next;
				while(fN != null &&  sN != null) {
					
					if(!fN.data.equals(sN.data)) {
					   match= false;
					   break;
					}
					match=true;
					fN = fN.next;
					sN= sN.next;
				}
			}
		}else { 
			System.out.println("one linked list is empty"); 
			return match;		
		}
		return match;
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
}
	

