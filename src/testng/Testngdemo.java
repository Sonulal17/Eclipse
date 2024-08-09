package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngdemo {

		@BeforeTest
		public void setup()
		{
			System.out.println("browser open");
		}
		
		@BeforeMethod
		public void urlloading()
		{
			System.out.println("url open");
		}
		
		@Test(priority=3,enabled=false)
		
		public void test1()
		{
			System.out.println("test 1");
		}
		
		@Test(priority=2,invocationCount=2)
		
		public void test2()
		{
			System.out.println("test 2");
		}
		
		@Test(priority=1,dependsOnMethods= {"test2"})
		
		public void test3()
		{
			System.out.println("test 3");
		}
		
		@AfterMethod
		
		public void method()
		{
			System.out.println("report generation");
		}
		@AfterTest
		
		public void browserclose()
		{
			System.out.println("browser close");
		}
}
