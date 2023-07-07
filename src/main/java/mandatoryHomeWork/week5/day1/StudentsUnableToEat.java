package mandatoryHomeWork.week5.day1;

import java.util.ArrayList;
import java.util.List;

public class StudentsUnableToEat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] students = {1,1,1,0,0,1}; int[] sandwiches = {1,0,0,0,1,1};
		int countStudents = countStudents(students, sandwiches);
System.out.println(countStudents);
	}
	
	public static int countStudents(int[] students, int[] sandwiches) {
        int j=0;
		    int count=0;
		    List<Integer> lis = new ArrayList<>();
		    //adding to the list
		    for(int i=0;i<students.length;i++)
		         lis.add(students[i]);
		    
		    while(j<=sandwiches.length-1){
		        //checking student and sandwich is same 
		        if(lis.get(0)==sandwiches[j]){
		            lis.remove(0);
		            j++;
		            count=0;
		        }
		        else if (lis.get(0)!=sandwiches[j]){
		            lis.add(lis.get(0));
		            lis.remove(0);
		            count++;
		        }
		        
		        if(j==sandwiches.length || count==lis.size())
		            return lis.size();
		    }  
		    
		    return 0;
   }

}
