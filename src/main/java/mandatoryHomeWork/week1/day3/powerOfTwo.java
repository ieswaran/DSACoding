package mandatoryHomeWork.week1.day3;

public class powerOfTwo {

	public static void main(String[] args) {
		boolean b = false;
		double input = 9;
		
		if (input==1) 
			System.out.println( true);
		else {
		while(input>2) {
			input = input/2 ;
			}
		
		if (input  == 2) {
			b = true;
			System.out.println(b);
		} else {

			System.out.println(b);
		}
	}
}
	}
