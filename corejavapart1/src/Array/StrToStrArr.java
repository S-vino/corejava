package Array;
//import java .lang.*;
import java.util.Arrays;


public class StrToStrArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hii how are you?";
		String a[]=s.split(" ");
		String [] str3=new String[a.length];
		for(int i=a.length-1,j=0;i>=0;i--,j++)
		{
			str3[j]=a[i];
		}
		System.out.println(Arrays.toString(str3));
	}

}
