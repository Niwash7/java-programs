package tY.practise;

public class RevAStringWIth3rdVariable {
	
	public static void main(String[] args) {
		String s = "java";
		String rev ="";
		for(int i = s.length()-1; i>=0; i--) {
			
			rev = rev + s.charAt(i);
			
		}
		System.out.println(rev);
		
	}

}