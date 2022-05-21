package week1.day1;

public class TwoWheeler 
{

	int noOfWheels=2;
	short noOfMirrors =1;
	long chasisNumber= 98283882828l;
	boolean isPunctured= false;
	String bikeName="Honda Dio";
	double runningKM = 61345.892;
	
	public static void main(String[] args) 
	{
		TwoWheeler obj=new TwoWheeler();
		System.out.println("Display the no of wheels=" + obj.noOfWheels );
		System.out.println("Display the no of mirros=" + obj.noOfMirrors);
		System.out.println("Display the chasis number=" + obj.chasisNumber);
		System.out.println("Display is puncture or not=" + obj.isPunctured);
		System.out.println("Display the Bike name=" + obj.bikeName);
		System.out.println("Display the Bike name=" +obj.runningKM);
	}

}
