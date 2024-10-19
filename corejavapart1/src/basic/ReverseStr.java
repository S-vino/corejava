package basic;
//import java.util.*;
public class ReverseStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="vino";
		String b=" ";
		
		int str=a.length()-1;
		while(str>=0)
		{
			b=b+a.charAt(str);
			str--;
		}
		System.out.println(b);
	}
	
	
}
