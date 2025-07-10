package Maven_package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation {
	
	public static void main(String[] args) throws Exception{
	System.setProperty("webdriver.chrome.driver","F:\\Webappzap_Auto_Setup\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    WebDriver driver= new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    driver.get("https://www.flipkart.com/");
    Thread.sleep(3000);
   // driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
    WebElement fash=driver.findElement(By.xpath("//*[text()='Fashion']"));
    Actions act = new Actions(driver);
    act.moveToElement(fash).build().perform();
    Thread.sleep(3000);
    act.contextClick().build().perform();
    Thread.sleep(3000);
    act.sendKeys(Keys.ENTER).build().perform();
    Thread.sleep(3000);
    WebElement Home=driver.findElement(By.xpath("//*[text()='Mobiles']"));
    act.sendKeys(Home, Keys.ENTER).build().perform();
    System.out.println("home key pressed");
    
}
}

