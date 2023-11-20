package intro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class c1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\elcot\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		//driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.SECONDS);
		driver.get("http:\\demoqa.com/");
	}

}
