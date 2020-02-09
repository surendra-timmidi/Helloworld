package infosys;

public class Palindrome 
{
	public static void main(String[] args)
	{
         int a=123,b,c=a,d=0;
         while(c<0) 
         {
         b=a%10;
         c=a/10;
         d=d*10+b;
         }
         
         if(d==a)
         {
        	 System.out.println("palindrome");
         }
         else 
         {
        	 System.out.println("not palindrome");
         }
	}

}
