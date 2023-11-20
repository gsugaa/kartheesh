package intro;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\elcot\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		ChromeDriver ce=new ChromeDriver();
		ce.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		//identifyng the dropdown box
        ce.findElementById("justAnInputBox").click();
        
		//desired value =>   0             1           2
		String value[]= {"choice 2 2", "choice 2 3", "choice 3"};
		
		//fetching all the choices using classname and tagname in xpath 
		List<WebElement> ele = ce.findElementsByXPath("//span[@class='comboTreeItemTitle']");//1  2 22 23 3 4 5 6
		if(!value[0].equals("All"))// 
			
		{
			
		for(WebElement o:ele) //iterating through the elements    
		{
			String txt = o.getText();
			
			for(String v:value)//iterating through the value array
			{
				if(txt.equalsIgnoreCase(v))//  choic1   === value[0] 
			{
				o.click();
			}
	}
		}
		}
	}
}

