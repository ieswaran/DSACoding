package week5.day5;

import org.junit.Test;

import linkedListImpl.MyLinkedList;
import linkedListImpl.MyLinkedList.Node;

public class ReverseLinkedListII extends MyLinkedList {

@Test
public void addNode1() {

		Node newNode = new Node(1);
		newNode.next=new Node(2);
		newNode.next.next=new Node(3);
		newNode.next.next.next=new Node(4);
		newNode.next.next.next.next=new Node(5);
		
		int left=2;
		int right=4;
		
			
		displayNode(rotateLinkedList(newNode,left,right));
		
	}
	

	@Test
	public void addNode2() {

		Node newNode = new Node(0);
		newNode.next=new Node(1);
		newNode.next.next=new Node(2);
		newNode.next.next.next=new Node(3);
		
		int left=1;
		int right=2;
		
			
		displayNode(rotateLinkedList(newNode,left,right));
		
	}
	
	@Test
	public void addNode3() {

		Node newNode = new Node(5);
		
		
		int left=1;
		int right=1;
		
			
		displayNode(rotateLinkedList(newNode,left,right));
		
	}


	private Node rotateLinkedList(Node head, int left, int right) {
		
		Node temp=head;
		int count=1;
		Node prev;
		Node left1;
		 while(count!=right) {
			 temp=temp.next;
			 count++;
		 }
		 
		 prev=temp.next;
		 temp.next=null;

		 temp=head;
		 count=2;
		 while(count<left) {
			 temp=temp.next;
			 count++;
		 }
		 Node left2=temp.next;
		 temp.next=null;
		 while(left2.next!=null) {
			 left1=left2.next;
			 left2.next=prev;
			 prev=left2;
			 left2=left1;
		 }
		 left2.next=prev;
		 prev=left2;
		head.next=prev;
		return temp;
	}
	
}
