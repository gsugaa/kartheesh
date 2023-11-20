package attributes;

import org.testng.annotations.Test;

public class a7 {
	//dependsOnMethods: create connection between test cases 
	
	
		@Test(priority=0)
		public void visiting()
		{
			System.out.println("visiting website ");
		}
		
		@Test(priority=1,dependsOnMethods="visiting")
		public void lg()
		{
			System.out.println("login");
		}
		
		
		//visiting: pass     lg: pass
		//visiting: fail     lg: skipped
}
