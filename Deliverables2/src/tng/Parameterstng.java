package tng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterstng 
{
	 @Test
	   @Parameters("myName")
	   public void parameterTest(String myName) 
	 	{
		 System.out.println("**********!!Parameterizaion STARTs Here!!**********");
	     System.out.println("My Name has beeen Parameterized as : " + myName);
	     System.out.println("**********!!Parameterizaion ENDs Here!!**********");
	 	}
}
