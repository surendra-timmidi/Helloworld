package core_java_programms;

public class Remotewebelement implements Webelement {

	@Override
	public void findelement() 
	{
     System.out.println("find elemnet");
		
	}

	@Override
	public void sendkeys() 

	{
		System.out.println("senkeys");
	}

	@Override
	public String getText() 
	{
		String s="hell";

		System.out.println("gettext");
		return s ;
	}

	@Override
	public void hello() 
	{
		System.out.println("hello");
	}

	public static void main(String[] args)
	{
		Remotewebelement r=new Remotewebelement();
		
	}
	
}
