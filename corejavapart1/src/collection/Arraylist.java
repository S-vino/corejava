package collection;
import java.util.*;
import java.util.Arrays;
class Employee1{
	private int empno;
	private String ename;
	private int salary;
	Employee1 (int empno,String ename,int salary){
		this.empno=empno;
		this.ename=ename;
		this.salary=salary;
	}
	public int getEmpno() {
		return empno;
	}
	public int getSalary() {
		return salary;
		
	}
	public String  getEname() {
		return ename;
		
	}
	public String toString() {
		return empno + ""+ename+""+salary;
	}
	
}


public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee1>e1=new ArrayList<Employee1>();
		Scanner s=new Scanner(System.in);
		Scanner s1=new Scanner(System.in);
		int ch;
		do {
			System.out.println("1.insert\n 2.display\n3.");
		}
	}

}
