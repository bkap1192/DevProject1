package DevProject1.DevProject1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class App 
{
	public void fn_launchrowser(){
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");	
		
	}
	
}
