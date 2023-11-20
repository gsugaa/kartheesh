package asserts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(Listener.itest.class)
public class softassert {
	@Test
	public void hs() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\elcot\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		 ChromeDriver ob = new ChromeDriver();
		ob.get("http://www.google.com");
		File f = ob.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(f, new File("C:\\Users\\elcot\\eclipse-workspace\\9.30am\\src\\main\\java\\asserts\\f.png"));
		
		
		
		
		SoftAssert s=new SoftAssert();
		
		s.assertEquals(ob.getTitle(),"Google");
		s.assertNotEquals(ob.getTitle(), "yahoo");
		WebElement ele = ob.findElement(By.linkText("Images"));
		s.assertTrue(ele.isDisplayed());
		s.assertFalse(ele.isSelected());
		ob.quit();
		s.assertAll();
	}
}
