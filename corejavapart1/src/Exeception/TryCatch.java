package Exeception;
import java.util.*;
import java.lang.*;
public class TryCatch extends Exception {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException e){
		 System.out.println(e);
			
		}
		
	}

}
