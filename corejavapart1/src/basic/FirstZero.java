package basic;
import java.util.Arrays;
public class FirstZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {4,7,0,6,0,3,0,2,0};
		int temp;
		        int j = 0; // Pointer for the next non-zero element

		        for (int i = 0; i < a.length; i++) {
		            if (a[i] != 0) {
		                a[j++] = a[i]; // Move non-zero elements to the front
		            }
		        }

		        while (j < a.length) {
		            a[j++] = 0; // Fill the remaining positions with zeros
		        }

		        System.out.println(Arrays.toString(a));
		    }


		//for(int i=0;i<a.length;i++) {
		//	if(a[i]==0) {
		//		temp=a[i];
		//		a[i]=a[i+1];
		//		a[i+1]=a[i];
		//	}
			
		
}


