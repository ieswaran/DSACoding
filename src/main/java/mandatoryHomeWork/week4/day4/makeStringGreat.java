package mandatoryHomeWork.week4.day4;

public class MakeStringGreat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "leEeetcode";
		String makeGood = makeGood(s);
		System.out.println(makeGood);
	}
    public static String makeGood(String s) {
      	if (s.isEmpty() || 1 == s.length()) {
			  return s;
			}
		int start = 0;
		int adj = 1;
		int end = s.length();
		 char[] arr = s.toCharArray();
		while (start < end && adj < end) {
			boolean goodPair = isGoodPair(arr[start], arr[adj]);
			
			while (isGoodPair(arr[start], arr[adj])) {
				
				arr[start] = '\0';
				arr[adj] = '\0';
				while (start > 0 && arr[start] == '\0') {
					start--;
				}
				if (adj < end - 1) {
					adj++;
				}
			}
			start = adj;
			adj++;
		}
		StringBuilder res = new StringBuilder();
		for (char aChar : arr) {
			if (aChar != '\0') {
				res.append(aChar);
			}
		}
		return res.toString();
	}
    
	private static boolean isGoodPair(char charAt, char charAt2) {
	//	System.out.print("compare: "+charAt+"||"+charAt2);
		if (charAt + 32 == charAt2 || charAt == charAt2 + 32) {
		//	System.out.println(":true");
			return true;
		}
	//	System.out.println(":false");
		return false;
	}

}
