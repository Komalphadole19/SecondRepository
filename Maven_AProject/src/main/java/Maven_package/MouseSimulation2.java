package Maven_package;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseSimulation2 {
     public static void main(String[] args) throws Exception{
	 System.setProperty("webdriver.chrome.driver","F:\\Webappzap_Auto_Setup\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
     WebDriver driver= new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
     driver.get("https://jqueryui.com/droppable/");
	 Thread.sleep(3000);
	 List<WebElement> allFrames = driver.findElements(By.tagName("iframe"));
	 System.out.println("total frames"+ allFrames.size());
	 

	}

}
