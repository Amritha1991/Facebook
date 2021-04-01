package LoginPage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTC {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sakthi\\eclipse-workspace\\FaceBook Login\\driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Thread.sleep(2000);
		//JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("window.scrollBy(0,300)");
		//Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[@class=\"btn btn-primary\"])[1]")).click();
		//driver.switchTo().alert().accept();
		driver.findElement(By.xpath("(//input[@class=\"ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted\"])[1]")).sendKeys("Chennai");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class=\"ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted\"])[2]")).sendKeys("Kannur");
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class=\"ui-dropdown-trigger ui-state-default ui-corner-right\"]")).click();
		WebElement findElement = driver.findElement(By.xpath("(//span[@class=\"ng-tns-c11-6 ng-star-inserted\"])[10]"));
		findElement.click();
		driver.findElement(By.xpath("//span[@class=\"ui-button-icon-left ui-clickable fa fa-fw fa-calendar\"]")).click();
		driver.findElement(By.xpath("(//a[@class=\"ui-state-default ng-tns-c12-5 ng-star-inserted\"])[6]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@class=\"search_btn\"])[2]")).click();
	}

}
