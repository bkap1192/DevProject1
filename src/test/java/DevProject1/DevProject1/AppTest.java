package DevProject1.DevProject1;

import org.testng.annotations.Test;

public class AppTest {
	
	
	@Test()
	public void fn_runGoogle(){
		App gle=new App();
		gle.fn_launchrowser();
		System.out.println("method is running");
		System.out.println("Hey I'm Barkha");
		System.out.println("Hey I'm Akash");
		System.out.println("Hey I'm Harish");
	}
   
}
