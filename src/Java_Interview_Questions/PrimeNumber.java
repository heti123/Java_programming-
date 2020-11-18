package Java_Interview_Questions;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		
		 int num = sc.nextInt();
		if(findPrimeNum(num)) {
			System.out.println(num+ " is prime number");
		}
		else {
			System.out.println(num+ " is not prime number" );
			}
		
		

	}
public static Boolean findPrimeNum(int num) {
	
	int number=0;
	boolean flag = false;
	 for(int i=2; i<=num/2;i++) {
		 if(num%i == 0) {
			 flag =true;
			 break;
		 }
		 }
	 if(flag) {
		 return false;
	 }
	 else {
	 return true ;
	 
}
}
}

