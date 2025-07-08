package Maven_package;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Page1  {
	public WebDriver driver;
	String Baseurl = "https://todomvc.com/";
	
   @BeforeTest
   public void openBrowser(){
	System.setProperty("webdriver.chrome.driver",  "F:\\Webappzap_Auto_Setup\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://todomvc.com/");
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
          }

  
}
