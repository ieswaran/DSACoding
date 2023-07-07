package mandatoryHomeWork.week8.day4;

import org.junit.Test;

public class MarsExploration {
	 @Test
	    public void posCase() {
		 	String s="SOSSOS";
	    	System.out.println(marsExploration(s));
	    }

		@Test
	    public void negCAse() {
			String s="SOSSOT";
	    	System.out.println(marsExploration(s));
	    }
		
		@Test
	    public void edgeCAse() {
			String s="TOP";
	    	System.out.println(marsExploration(s));
	    }
	    private static int marsExploration(String s) {
			// TODO Auto-generated method stub
	    	 int count=0, i;
	    	    for(i=0; i < s.length(); i=i+3){
	    	        if(s.charAt(i) != 'S' )
	    	            count++;
	    	        
	    	        if( s.charAt(i+1) != 'O' ){
	    	            count++;
	    	        }
	    	        if(s.charAt(i+2) != 'S')
	    	        count++;
	    	    } 
	    	    return count;
	    	    }
		}