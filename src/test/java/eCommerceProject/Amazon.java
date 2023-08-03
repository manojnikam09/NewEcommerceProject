package eCommerceProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Amazon {
  @Test
  public void amazontest() throws InterruptedException 
  {
	  WebDriver driver=new ChromeDriver();
	  Reporter.log("opening",false);
	  driver.get("https://www.amazon.in/");
	  Thread.sleep(3500);
	  driver.close();
  }
}
