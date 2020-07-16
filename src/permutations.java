
public class permutations {
	public static void main(String[] args) {
        String str = "ABC"; 
        int n = str.length(); 
        permute(str, 0, n-1); 
	}
	
	private static void permute(String str, int left, int right) {
		if (left == right) 
			System.out.println(str);
		
		//  		  				ABC
		//left = 0: 	ABC 		BAC 		CBA
		//left = 1:   ABC ACB	  BAC BCA	  CBA CAB
		//left = 2:print
		else {
			for (int i = 0; i < str.length(); i++) {
				str = swap(str, left, i);
				permute(str, left + 1, right);
				str = swap(str, i, left);
			}
		}
	}
	
	private static String swap(String str, int left, int i) {
        char temp; 
        char[] charArray = str.toCharArray(); 
        temp = charArray[left] ; 
        charArray[left] = charArray[i]; 
        charArray[i] = temp; 
        return String.valueOf(charArray); 
	}
}
