package basic;

public class Mobile {
	
	String a="ram";
	double b=12000.0;
	String c=" vivo";

	public static void msg() {
		System.out.println("here we can pass the msg");
	}
	
	public static void viedoCall() {
		System.out.println("here we can talk in video call");
	}
	
	public static void audioCall() {
		System.out.println("here we can talk in audio call");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(msg());
		
		msg();
		
		Mobile.viedoCall();
		
		Mobile m1= new Mobile();
		m1.audioCall();
		
	}

}
