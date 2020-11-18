package Java_Interview_Questions;
import java.util.ArrayList;

public class DuplicateInArray {

	public static void main(String[] args) {
	
		int []a = {2,4,6,3,5,5,2,3,7};
		//2-2
		//4-1
		//6-1
		//3-2
		//5-2
		//7-1
		ArrayList<Integer> ab = new ArrayList<Integer>();
		for(int i=0; i<a.length;i++) {
			int k = 0;
		
			if(!ab.contains(a[i])){
				k++;
			ab.add(a[i]);
			for(int j =i+1;j<a.length;j++) {
				if(a[i]==a[j])
				 k++;
				}
			
	
		System.out.println(a[i]);
		System.out.println(k);
	       }	
		}
	}

}