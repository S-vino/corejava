package Exeception;

public class RunTimeExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=2;
		float c;
		try {
			c=a/b;
			System.out.println("Value of C: "+c);
			int arr[]= {-2,3,4};
			System.out.println("Value of arr[5]: "+arr[2]);
			System.out.println("Value of arr[-2]: "+arr[0]);
			String s="123";
			String s1="pkdfp";
			System.out.println("Convert into number: "+Integer.parseInt(s1));
			String str="Hello";
			//String str=null ;
			System.out.println("Length: "+str.length());
			
			int []array=new int[-3];
			System.out.println("array length:" + array.length);		
			}
		catch (ArithmeticException e || NegativeArraySizeException e) 
		{
				System.out.println(e);
		}
			
		//catch (NegativeArraySizeException e2)
		//{
			//System.out.println("negative array size exception");
		//}
		catch (NumberFormatException e3) {
			System.out.println("number format exception");
		}
		
		

	}

}
