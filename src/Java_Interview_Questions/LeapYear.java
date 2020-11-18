package Java_Interview_Questions;

public class LeapYear {

	public static void main(String[] args) {
		//there are two conditions
		//1. If the year is divisible by 400 then it is exactly a leap year
		//2. If the year is divisible by 4 and is not divisible by 100 then also it is a leap year
		
		int year = 2016;
		
		
		if(year%400 == 0) {
			System.out.println("leap year");
			
			}
		else if(year%4==0 && year%100 !=0) {
			System.out.println("leap year");
		}
		else {
			System.out.println("Not a leap year");
		}
	}

}
