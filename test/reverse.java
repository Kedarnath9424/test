package page51;


/**
 * @author WAP to rev.number.
 *
 */
public class reverse {
	public static void main(String[] args)
	{
		int number=123,reverse =0;
		
		while(number!=0)
		{
		 
		 int remainder = number % 10;
		 reverse = reverse*10+remainder;
		 number = number/10;
			
			
		}
		System.out.println("the reverse of the given number" + reverse);
	}

}
