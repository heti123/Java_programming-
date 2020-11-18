package Java_Interview_Questions;
import java.util.ArrayList;

public class CompareArrays {
	//compare same indexes of two different arrays and create another array for matching values

	public static void main(String[] args) {
		int []a = {1,2,4,7,9,8};
		int []b = {2,5,4,6,9,8};
		ArrayList<Integer>al = new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++) {
			if(a[i] == b[i]) {
				al.add(a[i]);
			}
		}
		//if asked to use Array then convert to array from arraylist
		Object[] c = al.toArray();
		for(Object obj : c) {
			System.out.println(obj);
		}

	}

}
