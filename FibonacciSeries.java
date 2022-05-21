package week1.day1;

public class FibonacciSeries 

{
	/*Goal: To find Fibonacci Series for a given range
	 
	 Sum of preceeding the two numbers
	
	 * input(range): 8 output: 0, 1, 1, 2, 3, 5, 8, 13
	 **/
	
	public static void main(String[] args) 
	{
		int range=8;
      int firstNum=0;
      int secNum=1;
      
      System.out.println(firstNum);
      System.out.println(secNum);
   
      for (int i=1; i<range; i++)
      {
    	  int sum= firstNum+secNum;
    	  
    	  firstNum=secNum;
    	  secNum=sum;
    	  
    	  System.out.println(sum);
      }
    	 
    		  
		
		
		
		
	}

}
