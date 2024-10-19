package basic;

public class MobileNonStatic {
	String a="ram";
	double b=12000.0;
	String c=" vivo";
	
	MobileNonStatic(){
		System.out.println("this is constructor");
		System.out.println(a);
		
	}

	public void msg() {
		System.out.println("here we can pass the msg");
	}
	
	public void viedoCall() {
		System.out.println("here we can talk in video call");
	}
	
	public void audioCall() {
		System.out.println("here we can talk in audio call");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//...msg();--->CTE
		
		// System.out.println(a);--> non static variable can't be normally used in the static context. 
		MobileNonStatic m1=new MobileNonStatic();
		System.out.println(m1.a);
		System.out.println(m1.b);
		m1.b=10;
		System.out.println(m1.b);
		
		m1.msg();
		
		
		
		}
	}

