package LoginPage;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class YouTube {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id=\"search\"]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id=\"search\"]")).sendKeys("vathicoming");
	Robot r = new Robot();
	for (int i=0; i<7 ; i++) {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//a[@id=\"video-title\"])[1]")).click();
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0, 400)");	
	Thread.sleep(5000);
	jse.executeScript("location.reload(0);");
	Thread.sleep(4000);
	WebElement findElement = driver.findElement(By.xpath("//input[@id=\"search\"]"));
	r.keyPress(KeyEvent.VK_BACK_SPACE);
	r.keyRelease(KeyEvent.VK_BACK_SPACE);
	Thread.sleep(3000);
	findElement.sendKeys("Mark Weins Mumbai");
	for ( int i = 0; i<5; i++) {
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	
	}
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	
	}

}
