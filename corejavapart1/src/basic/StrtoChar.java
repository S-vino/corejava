package basic;
import java.util.*;

public class StrtoChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="i like you";
		char [] ch=new char[s.length()];
		
		for(int i=0;i<s.length();i++)
		{
			ch[i]=s.charAt(i);
		}
		System.out.println(Arrays.toString(ch));
	}
	

}
