package basic;
import java.util.Arrays;
public class SortWithOutMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="vino";
		char [] ch=s.toCharArray();
		
		for(int i =0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++) 
			{
				if(ch[i]>ch[j])
				{
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]= temp;
					
				}
			}	
		}
		
		System.out.println(Arrays.toString(ch));
		
	}

}
