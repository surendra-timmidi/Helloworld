package core_java_programms;

public class Poly1 extends Polaymorphism  
{

	public void eat()
	{
		System.out.println(" child eating");
	}
	
	public void sleep()
	{
		System.out.println("child I am sleeping");
	}
	
	public static void main(String[] args)
	{
		Polaymorphism p=new Polaymorphism();
 	    p.eat();
 	    
 	    Poly1 p1=new Poly1();
 	    p1.eat();
	   
	}
}
