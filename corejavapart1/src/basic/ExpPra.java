package basic;
import java.util.*;
class GetReadyFastException extends Exception{
	public GetReadyFastException(String msg) {
		super(msg);
	}
	
}

class SleepException extends Exception{
	public SleepException(String msg) {
		super(msg);
	}
}

class Time{
public static String time(int wake) throws SleepException, GetReadyFastException{
	if(wake>8) {
		try {
			throw new GetReadyFastException("time up");
			
		}
		catch(GetReadyFastException e) {
			System.out.println(e.getMessage());
		}
	}
	else {
		try {
			throw new SleepException("sleep well");
		}
		catch(SleepException e){
			System.out.println(e.getMessage());
		}
	}
	return "its yor time";
}
}
public class ExpPra {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the wake up time");
		//int wake_up=sc.nextInt();
		try {
			Time.time(sc.nextInt());
		} 
		catch (SleepException | GetReadyFastException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}