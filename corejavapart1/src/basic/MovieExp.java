package basic;
import java.util.*;

class MovieTimeException extends Exception{
	
}
class StudyTimeException extends Exception{
	
}
public class MovieExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the hours:");
		if(sc.nextInt()>=12) {
			try {
				throw new MovieTimeException();
			}
			catch(MovieTimeException e){
				System.out.println("go to movie its 12'o clock ");
			}
		}
		else {
			try {
				throw new StudyTimeException();
			}
			catch(StudyTimeException e)
			{
				System.out.println("go to study its your study time");
			}
		}
	}

}
