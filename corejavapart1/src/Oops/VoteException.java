package Oops;

public class VoteException extends Exception{
	public VoteException(String msg) {
		System.out.println("its an exception");
	}
	
}

class Demo1{
	void CheckAgeForVote(int age) throws VoteException{
		if(age>18)
		{
			throw new VoteException("invalid age for vote");
			
		}
		else {
			System.out.println("you can put your hote");
		}
	}
	public static void main(String[] args)
	{
		Demo1 d=new Demo1();
		try {
			d.CheckAgeForVote(30);
		}
		catch(VoteException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("end of vote code");
		}
	}
	
}
