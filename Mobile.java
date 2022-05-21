package week1.day1;

public class Mobile 
{

	public void makeCall()
	{
		System.out.println("Print Calling");
	}
	
	public void sendMsg()
	{
		System.out.println("Print Messaging");
	}
	
	public static void main(String[] args) 
	{
		Mobile b1=new Mobile();
		b1.sendMsg();
		b1.makeCall();
	}
}



