package basic;

public class variables {
	static int a=10;
	int c=20;
	public static void main(String[] args) {
		// static variable, instance variable,local variable
	variables a=new variables();
	System.out.println("it is a local variable"+ a);
	
	System.out.println("static with obj"+variables.a);
	
	 System.out.println("static variable"+variables.a);
	 
	 
	 variables i=new variables();
	 System.out.println("instance variable"+i.c);
	 
	 
	 int d=40;
	 System.out.println("local variable"+d);
	 }

}
class VariableDemo {
    static int count = 0;//static 
    int cnt = 0;// Instance
    public void increment() {
        count++;
    }
    public void incre() {
        cnt++;
    }

class StaticEx {
    public static void main(String args[]) {
        VariableDemo v=new VariableDemo();
        v.increment();
        System.out.println("Count static :"+VariableDemo.count);//1
        VariableDemo v1=new VariableDemo();
        v1.increment();
        System.out.println("Count static  2 time:"+VariableDemo.count);
        VariableDemo v2=new VariableDemo();
        v2.incre();
        System.out.println("Count instance :"+v2.cnt);
        VariableDemo v3=new VariableDemo();
        v3.incre();
        System.out.println("Count instance :"+v3.cnt);
        }
}
}