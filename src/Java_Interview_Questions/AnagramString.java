package Java_Interview_Questions;
import java.util.Scanner;

public class AnagramString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string a:");
	String a =sc.next();
	System.out.println("enter a string b:");
	String b =sc.next();
		int count=0;
		for(int i=0;i<a.length();i++) {
			for(int j=i+1;j<a.length();j++) {
				if(a.charAt(i)==a.charAt(j)) {
					count++;
				}
	
		System.out.println(a.charAt(i));
		System.out.println(count);
	}
}
		int count1=0;
		for(int i=0;i<b.length();i++) {
			for(int j=i+1;j<b.length();j++) {
				if(b.charAt(i)==b.charAt(j)) {
					count1++;
				}
		
		
		System.out.println(b.charAt(i));
		System.out.println(count1);
			}
	}
		
		
		
		
	}

}
