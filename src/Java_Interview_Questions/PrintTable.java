package Java_Interview_Questions;

public class PrintTable {

	public static void main(String[] args) {
		int result = multiply(5,10);
		System.out.println(result);
// i has to sum itself j times
	}
	public static int multiply(int i , int j) {
		int result = 0;
		for(int a=1;a<=j;a++) {
		result = result+i;	
		
		}
		return result;
	}

}
