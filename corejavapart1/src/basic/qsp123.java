package basic;

 class qsp123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="qspvada";
		int[] a= {1,2,3,4,5,6};
		//qsp321vada654
		int res=0,r=0;
	//	String var_num="";
	//	String []ch=s.split("");
		String str1=s.substring(0,3);
		String str2=s.substring(3,7);

//		System.out.print(str1+a[2]+a[1]+a[0]);
//		System.out.println(str2+a[5]+a[4]+a[3]);
		
		for (int i=a.length-1;i>=0;i--) 
		{
			//String res=""+i;
			//System.out.print(i);
			if(a[i]<=3) {
				res=res*10+a[i];
			}
			if(a[i]>=4) {
				r=r*10+a[i];
			}
			
		}
		System.out.println(str1+res+str2+r);
	}
	
}
