package basic;
import java.util.Scanner;

public class ReverseString {
	static Scanner sc=new Scanner(System.in);	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String b[]=new String[4];
	for(int j=0;j<b.length;j++)
	{
		b[j]=sc.nextLine();
	}
	
	for(int j=0;j<b.length;j++)
	{
		System.out.println(b[j]);
	}
	
		
		
	String a[]= {"vino","sakthi","sheela","ram","vivi"};
	for(int i=a.length;i>0;i++)
	{
		System.out.println(a[i]);
	}
	
	}

}
