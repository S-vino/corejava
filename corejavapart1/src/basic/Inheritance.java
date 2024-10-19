package basic;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	ram r1= new ram();
		
		//r1.display();
		//r1.height();
		//System.out.println();
	//	vivo v1=new vivo();
		//System.out.println("");
	//	v1.display();
		//v1.height();
		
		//upcasting
		ram r2=new vivo();
		r2.display();
		//r2.height();// for it can't display
		 
		
		//downcasting
		vivo v2=(vivo)r2;
		v2.height();
		v2.display();
		
	}
	

}

class ram{
	void display() {
		System.out.println("it is ram");
	}
}
class vivo extends ram{
	void height() {
		System.out.println("it is vivo");
	}
}

