package Java_Interview_Questions;
import java.util.ArrayList;

public class AscDescOrder {
	public static void main(String[] args) {
		int []a = {2,1,5,7,4,9,6}; //9,7,6,5,4,2,1
		//1,2,4,5,6,7,9
		
		int temp;
		for(int i=0; i< a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp =a[i];
					a[i] =a[j];
					a[j] = temp;
				}
			}
			System.out.println(a[i]);
		}
	}
		
}			
	


