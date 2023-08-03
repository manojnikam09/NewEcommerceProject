package eCommerceProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flipcart {
  @Test
  public void flipcarttest() throws InterruptedException 
  {
	  WebDriver driver=new ChromeDriver();
	  Reporter.log("opening Flipcart",true);
	  driver.get("https://www.flipkart.com/");
	  Thread.sleep(3000);
	  driver.close();
  }
}
