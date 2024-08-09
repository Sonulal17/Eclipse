package programs;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Junitdemo {

	@Before
	public void setup()
	{
		
		System.out.println("browser open");
		
	}
	
	@Test
	public void test()
	{
		System.out.println("test activities");
	}
	
	@Test
	public void test1()
	{
		System.out.println("fb test");
	}
	
	@After
	public void browserclose()
	{
		System.out.println("browser close");
	}

}
