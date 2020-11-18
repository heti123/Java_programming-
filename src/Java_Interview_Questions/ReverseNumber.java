package Java_Interview_Questions;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int num=589;
		
	    int rev=0;
		while(num!=0) {
			rev= 10*rev + num%10;
			num=num/10;
		}
		System.out.println(rev);

	}

}
