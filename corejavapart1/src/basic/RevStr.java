package basic;

public class RevStr {
	public static void main (String args[]) {
		
		String s="qspjsp";
		int [] a= {1,2,3,4,5,6};
		char []b=s.toCharArray();
		String ch="";
		for(int i=0;i<a.length;i++) {
			ch=b[i]+""+a[i];
			System.out.print(ch);
		}
		
		
		
		
	}
}
