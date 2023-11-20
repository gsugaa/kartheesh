package attributes;

import org.testng.annotations.Test;

public class dependongroups {

	//dependsOnGroups:  create connection between group and test cases
	
		@Test(priority=0,groups="L")
		public void t1()
		{
			System.out.println("test case 1");
		}
		
		@Test(priority=1,groups="L")
		public void t2()
		{
			System.out.println("test case 2");
		}
		
		@Test(priority=2,groups="M")
		public void g()
		{
			System.out.println("test case 3");
		}
		
		@Test(priority=3,dependsOnGroups="M")
		public void gh()
		{
			System.out.println("test case 4");
		}
		
		//L:  t1,t2   : pass      g:pass
		// even 1 fail            g: skip
}
