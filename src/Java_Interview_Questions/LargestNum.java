package Java_Interview_Questions;

public class LargestNum {

	public static void main(String[] args) {
		int x = 500;
		int y = 500;
		int z = 400;
		
		if (x>y && x>z) {
			System.out.println("x is greatest");
		}
		else if(y>z) {
			System.out.println("y is greatest");
		}
		else {
			System.out.println("z is greatest");
		}
		
		
		
		if(x>=y) {
			if(x>=z) {
				System.out.println("x is greatest");
			         }
			else {
				System.out.println("z is greatest");
			     }
		}
		else {
			if(y>=z) {
				System.out.println("y is the greatest");
			}
			else {
				System.out.println("z is the greatest");
			     }
			}
	}
		
		

}
