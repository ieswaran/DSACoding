package week5.day4;
import java.util.*;

import org.junit.Test;
public class ImplementStackUsingQueues {

	Queue<Integer> q1 = new ArrayDeque<Integer>();
	Queue<Integer> q2 = new ArrayDeque<Integer>();
	
	 public ImplementStackUsingQueues() {
	        
	    }
	    
	    public void push(int x) {
	        q1.add(x);
	        

	    }
	    
	    public int pop() {
	    	

	        return q1.remove();
	    }
	    
	    public int top() {
	    	return q2.peek();
	    	
	    }
	    
	    public boolean empty() {
	        if(q2.size()==0) {
	        	return true;
	        }
	        return false;
	    }
	    
	    @Test
	    public void test() {
	    	q1.add(1);
	    	q1.add(2);
	    	q1.add(3);
	    	q1.add(4);
	    	q1.add(5);
	    	
	    	System.out.println(q1.remove());
	    	System.out.println(q1.remove());
	    }

}
