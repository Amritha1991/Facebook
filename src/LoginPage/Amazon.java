package LoginPage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("(//input[@class=\"a-button-input\"])[1]")).click();

		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("boatheadset", Keys.ENTER);
		Thread.sleep(3000);
		JavascriptExecutor jsc = (JavascriptExecutor)driver;
		jsc.executeScript("window.scrollBy(0,6000)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//li[@class=\"a-normal\"])[1]")).click();
		Thread.sleep(2000);
		jsc.executeScript("window.scrollBy(0,3800)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class=\"a-size-medium a-color-base a-text-normal\"])[16]")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("(//button[@class=\"a-button-text\"])[1]")).click();
		//Actions a = new Actions(driver);
		driver.findElement(By.id("//a[@id=\"nav-link-prime\"]")).click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
		
		
		
		
	

		
				
		
		
		
		
		
		
		
		

	}

}
