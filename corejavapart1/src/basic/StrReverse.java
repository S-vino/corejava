package basic;

public class StrReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="keera";
		String res="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			res=res+s.charAt(i);
		}
		System.out.println(res);
	}

}
