package Java_Interview_Questions;

public class AdjacentArray {

	public static void main(String[] args) {
		
	int[] a = {1,2,13,17,18};//1,11,4,1
		
	    int diff = 0;
		for(int i=0; i < a.length-1; i++ ) {
			
			if(a[i+1]-a[i]>diff) {
				diff =a[i+1]-a[i];

			}
			
			
		}
		System.out.println(diff);
	}
}
