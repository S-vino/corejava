package Array;

import java.util.Arrays;

public class LeadingZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {5,6,0,4,0,7,5,0};
		System.out.println(Arrays.toString(a));
		for(int i=a.length-1;i>=0;i--)
		{
			for(int j=a.length-1;j>0;j--)
			{
				if(a[j]==0)
				{
					int temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		
		
		//for(int i=0;i<a.length;i++)
		//{
		//	for(int j=0;j<a.length-1;j++)
		//	{
		//		if(a[j]==0 )
		//		{
		//			int temp=a[j];
		//			a[j]=a[j+1];
		//			a[j+1]=temp;
					
		//		}
		//	}
			
		//}
		//System.out.println(Arrays.toString(a));
		
		
	}
	

}
