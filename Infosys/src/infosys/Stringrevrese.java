package infosys;

public class Stringrevrese
{
	public static void main(String[] args) 
	{

		String s="surendra";
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		System.out.println(sb);
		StringBuilder sb1=new StringBuilder(s);
		sb1.reverse();
		System.out.println(sb1);
		
		
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
		
	}

}
