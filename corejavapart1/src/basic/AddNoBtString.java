package basic;

public class AddNoBtString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="sy3gh5h5gk6";
		char[] ch=s.toCharArray();
		int sum=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='0' && ch[i]<='9' )
			{
				sum=sum+ch[i]-48;
			}		
		}
		System.out.println(sum);
	}

}
