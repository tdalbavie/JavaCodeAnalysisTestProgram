import java.io.IOException;

public class MainTest 
{
	public static void main(String args[]) throws Exception
	{
		final int finalNum = 5;
		
		int NumberToBeIncremented = 0;
		System.out.println(NumberToBeIncremented);
		
		PermissionsCount pc = new PermissionsCount(0, 0, 0, 0);
		
		int NumberAfterIncrement = IncrementToTen(NumberToBeIncremented);
		System.out.println(NumberAfterIncrement);
		
		int i = 50;
		int j = finalNum;
		
		while (i != 50)
		{
			
		}
		
		do
		{
			
		}while (i != 50);
		
		for (int k = 0; k != 0; k++)
		{
			
		}
		
		int[] numbers = {1, 2};
		
		for (int number : numbers)
		{
			
		}
		
		switch("num")
		{
		case "notnum":
			break;
		case "num":
			break;
		}
		
		boolean notTrue = false;
		
		if(notTrue)
		{
			throw new IOException("This is a JRE exception.");
		}
		
		else if(notTrue)
		{
			throw new Exception("This is a generic exception.");
		}
		
		else if(notTrue)
		{
			throw new CustomExceptions("This is a custom exception.");
		}
		
		try
		{
			
		}
		catch(IOException e)
		{
			
		}
		
		try
		{
			
		}
		catch(Exception e)
		{
			
		}
		
		try
		{
			
		}
		catch(CustomExceptions e)
		{
			
		}
	}
	
	public static int IncrementToTen(int num)
	{
		if (num < 10)
		{
			num++;
			num = IncrementToTen(num);
			return num;
		}
		else
			return num;
	}
}
