package basic;

public class SumBtString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ram@12q53";
		//char ch[]=new char[s.length()];
		int sum=0;
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			if(ch >='1'&& ch<'5') {
				sum=sum+ch-'0';
			}
			
		}
		System.out.println(sum);
	}

}
