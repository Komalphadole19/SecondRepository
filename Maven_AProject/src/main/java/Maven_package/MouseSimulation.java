package Maven_package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseSimulation {
	
	public static void main(String[] args){
	System.setProperty("webdriver.chrome.driver","F:\\Webappzap_Auto_Setup\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    WebDriver driver= new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    
}
}

