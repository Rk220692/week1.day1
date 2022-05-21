package week1.day1;

public class MyCar 
{

	public void drivecar()
	{
		System.out.println("Drive the car");
	}
	
	public void applybrake()
	{
		System.out.println("Apply the Brake");
	}
	
	public void applyGear()
	{
		System.out.println("Apply Gear");
	}
	
	public void applyAccelerate()
	{
		System.out.println("Apply Acceleration");
	}
	
	
	public static void main(String[] args) 
	{
	MyCar a1 = new MyCar();
	a1.applybrake();
	a1.drivecar();
	a1.applyAccelerate();
	a1.applyGear();
	}
}
