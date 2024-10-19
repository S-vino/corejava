package basic;

public class StringExt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="java is my recommended language";
		System.out.println(str);
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		System.out.println(str.concat("JAVA"));
		System.out.println(str.charAt(5));
		String str1="java";
		String str2="          Java      ";
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str.charAt(5));
		System.out.println("index of value "+str.indexOf('e'));
		System.out.println(" last index of value "+str.lastIndexOf('e'));
		System.out.println("compare to "+str1.compareTo(str));
		//Sys
		System.out.println(str1.substring(1,3));
		System.out.println(str2.trim());// it will remove the starting and ending space.
	}

}
