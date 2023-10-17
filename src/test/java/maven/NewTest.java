package maven;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Factory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NewTest {
	
  
  
  @Test
  public void a() {
	  Reporter.log("Reporter log method...");
	  System.out.println("inside a method.");
  }
  @Test
  public void b() {
	  System.out.println("Inside b method.");
  }
  @Test
  public void c() {
	  System.out.println("Inside c method.");
  }
  @Test
  public void d() {
	  System.out.println("Inside d method.");
  }
  @Test
  public void e() {
	  System.out.println("Inside e method.");
	  SoftAssert asss=new SoftAssert();

	 
  }
  
  @Factory
  public Object[] getTestClasses() {
		Object[] tests = new Object[2];
		tests[0] = new Testing();
		tests[1] = new Testing();
		return tests;
}
}
