package Java_Interview_Questions;

public class CharcountInString {
	
	
	

	public static void main(String[] args) {
		
		int count = charOccurences( "aabca",'a');
		System.out.println(count);
	}
	
	public static Integer charOccurences(String word, char character ) {
		int count =0;
		for(int i=0;i<word.length();i++) {
			if(word.charAt(i)==character) {
				count++;
			}
		}
		
		return count;
		
		
	}

}
