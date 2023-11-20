package asserts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class hardassert {

	@Test
	public void hs()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\elcot\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		 ChromeDriver ob = new ChromeDriver();
		ob.get("http://www.google.com");
		//Assert.assertEquals(ob.getTitle(),"Google");
		//Assert.assertNotEquals(ob.getTitle(), "yahoo");
		WebElement ele = ob.findElement(By.linkText("Images"));
		Assert.assertTrue(ele.isDisplayed());
		Assert.assertFalse(ele.isSelected());
		ob.quit();
	}
}
