package mandatoryHomeWork.week11.day4;

import org.junit.Test;

/* n= 5 , m= 2 , s=1
 * n : the number of prisoners
	m : the number of sweets
	s : the chair number to start passing out treats at 
	return the end of the prisoner who gets the sweet*/
public class SaveThePrisoner {
	//@Test
	public void posCase() {
	int n = 5, m = 2, s=4;	
	System.out.println(saveThePrisoner(n, m, s));
	}
	@Test
	public void posCase2() {
	int n = 5, m = 7, s=5;	
	System.out.println(saveThePrisoner(n, m, s));
	}
	
	//@Test
	public void negCase() {
	int n = 5, m = 1, s=0;	
	System.out.println(saveThePrisoner(n, m, s));
	}
	
	//@Test
	public void edge() {
	int n = 5, m = 2, s=6;	
	System.out.println(saveThePrisoner(n, m, s));
	}
	
	public int saveThePrisoner(int n, int m, int s) {
		/*
		 * while(m != 0){ if(s < n ){ System.out.println("s < n before s:" + s); m--;
		 * System.out.println("s < n after m :" + m); if(m == 0){ return s; }else s++;
		 * 
		 * }else if(s == n){ System.out.println("s == n before s:" + s); m--; if(m ==
		 * 0){ return s; }else s=1;
		 * 
		 * }else if(s > n ) {return 0;} }
		 * 
		 * return s;
		 */
		 int r = m % n;
	        if ((r + s - 1) % n == 0) {
	            return n;
	        } else {
	            return ((r + s - 1) % n);
	        }		
	}

}
