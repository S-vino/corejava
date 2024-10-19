package Exeception;
class tryItOutException extends Exception{
	public tryItOutException(String msg) {
		super(msg);
	}
}

class notTryItOutException extends Exception{
	public notTryItOutException(String msg) {
		super(msg);
	}
}

public class WithOutTryCatch {

	public static void main(String[] args) throws tryItOutException,notTryItOutException
	{
		// TODO Auto-generated method stub
		try {
			if(true) {
					throw new tryItOutException("trying the exception handling with out using try and catch");
				}
		
		else {
			throw new notTryItOutException("this is a msg");
		}
	}
			
		
		
		catch(tryItOutException e) {
			System.out.println(e.getMessage());
		}
		catch(notTryItOutException e) {
			System.out.println(e.getMessage());
		}
	}
}
	

