package tng;
import org.junit.Assert;
import org.testng.annotations.Test;
public class Assertionstng 
{
  @Test
  public void AssertionsEqualsFails()
  {
	String ActualMe = "IamKesav1";
	String ExpectedMe = "IamKesav";
	System.out.println("**********!!Assertions STARTSs Here!!**********");
	Assert.assertEquals(ActualMe, ExpectedMe);
  }
  @Test
  public void AssertionsEqualsPass()
  {
	String ActualMe1 = "IamKesav";
	String ExpectedMe1 = "IamKesav";
	Assert.assertEquals(ActualMe1, ExpectedMe1);
	System.out.println("Asserttion Passed,Because Actual Value is " +ActualMe1+" & Expected Value is"+ ExpectedMe1);
  }
  @Test
  public String AssertionsFalse()
  {
	String ActualMe = "IamKesav1";
	String ExpectedMe = "IamKesav";
	Assert.assertFalse(ActualMe == ExpectedMe);
	System.out.println("Assertion False here!!");
	return "Assertion False here!!";
  }
  @Test
  public void AssertionsTrue()
  {	
	String ActualMe1 = "IamKesav";
	String ExpectedMe1 = "IamKesav";
	Assert.assertTrue(ActualMe1 == ExpectedMe1);
	System.out.println("**********!!Assertions ENDs Here!!**********");
  }
  @Test
  public void AssertionsNotEqual()
  {
	Assert.assertNotEquals("Assertion False here!!",AssertionsFalse(), 0);
	System.out.println("**********!!Assertions ENDs Here!!**********");
  }
}	
