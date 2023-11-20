package testngAnnotations;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class a1 {

	ChromeDriver ob;
	@Test(priority=0)
	public void t1()
	{
	System.out.println("Test case 1 : getting title "+ ob.getTitle());
	}


	@Test(priority=1)
	public void t2() throws InterruptedException
	{
	System.out.println("test case 2");
	Thread.sleep(3000);
	ob.findElementByLinkText("Gmail").click();
	}


	@BeforeTest
	public void bt()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\elcot\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	ob= new ChromeDriver();
	ob.get("http://www.google.com");

	System.out.println("before test: visiting google");
	}


	@AfterTest
	public void at()
	{
	System.out.println("after test: closing");
	ob.quit();
	}

	@BeforeClass
	public void btc()
	{
	System.out.println("before class: maximising");
	ob.manage().window().maximize();
	}



	@AfterClass
	public void atc()
	{
	System.out.println("after class : getting url "+ ob.getCurrentUrl());
	}


	@BeforeMethod
	public void bm()
	{
	System.out.println("before method: refresh");
	ob.navigate().refresh();
	}


	@AfterMethod
	public void atm()
	{
	System.out.println("after method: deleting cookies");
	//ob.manage().deleteAllCookies();
	}


	@BeforeSuite
	public void bs()
	{
	System.out.println("before suite");
	}


	@AfterSuite
	public void as()
	{
	System.out.println("after suite");
	}
	}

