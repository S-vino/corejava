package Oops;

public class Objcreation {
	String a;
	static int b;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=10;
		System.out.println(a);
		System.out.println(b);
		Objcreation o1=new Objcreation();
		System.out.println(o1.a);
		System.out.println(" object creation  ...."
				+ " inside the static context non static not allowed");
		
		System.out.println(o1.b);
	}

}
