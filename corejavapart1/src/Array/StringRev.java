package Array;

public class StringRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="java";
		String rev="";
		for(int a=s.length()-1;a>=0;a--) {
			rev += s.charAt(a);
		}
	    System.out.println(rev);
	}
	

}
