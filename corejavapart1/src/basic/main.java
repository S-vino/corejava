package basic;

class StockHighException extends Exception{
	public StockHighException(String msg) {
		super(msg);
	}
}

class StockLowException extends Exception{
	public StockLowException(String msg) {
		super(msg);
	}
}

class Stocks
{
	float stockRate;
	public Stocks(float stockRate) 
	{
		this.stockRate=stockRate;
	}
	
	public String checkRate(float rate) throws StockHighException,StockLowException
	{
		if (rate == stockRate *0.8) {
			return"hope to raise";
		}
		else if(rate<stockRate *0.8){
			throw new StockLowException("under loss");
		}
		else if(rate>stockRate*0.8) {
			throw new StockLowException("under profit");
		}
		
		return "nochange";
	}
}




public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Stocks stock=new Stocks(10.0f);
			stock.checkRate(5.0f);
		}
		catch(StockHighException e) {
			System.out.println(e.getMessage());
		}
		catch(StockLowException e) {
			System.out.println(e.getMessage());
		}
	}

}
