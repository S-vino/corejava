package basic;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="malayalam";
		String res="";
		for(int i=s.length()-1;i>=0;i--)
		{
			res+=s.charAt(i);
			//System.out.println(res);
		}
		if(s.equals(res))
		{
			System.out.println("it is a plaindrome");
		}
		else
		{
			System.out.println("it is a not plaindrome");
		}
	}

}
