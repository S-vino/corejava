

class ThreadOne extends Thread{
	public void run() {
		System.out.println("Thread1");
		int num=10;
		for (int i = 1; i <= 10; i++) {
	         System.out.println(num + "*" + i + "=" + num * i);
		}
	}
}
class Threadtwo extends Thread{
	public void run() {
		System.out.println("Thread2");
		for(int i=11;i<=15;i++) {
			System.out.println(i);
		}
	}

	

}


public class ThreadInheritance{

	
		public static void main(String[] args) {
			ThreadOne t=new ThreadOne();
			t.setName("Thread one");
			System.out.println("Thread Name"+t.getName());
			t.setPriority(Thread.MAX_PRIORITY);
			
			t.start();
			Threadtwo t1=new Threadtwo();
			t1.setPriority(2);// -->(1 to 10 )
			System.out.println("priority for t1"+t1.getPriority());
			System.out.println("normal priority"+Thread.NORM_PRIORITY);
			t1.start();

	}

		
}
