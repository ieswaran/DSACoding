package mandatoryHomeWork.week4.day5;

public class Folder {
	@Test
	public void posCase() {
		String[] logs = {"d1/","d2/","./","d3/","../","d31/"};
		System.out.println(minOperations(logs));
	}

	@Test
	public void negCase() {
		String[] logs = {"d1/","../","../","../"};
		System.out.println(minOperations(logs));
	}

	public int minOperations(String[] logs) {
		int c = 0;
		for(int i=0; i<logs.length; i++){
			if(logs[i].equals("../")){
				if(c!=0) c--;
			}
			else if(!logs[i].equals("./") && !logs[i].equals("../")) c++;
		}
		return c;
	}

}
