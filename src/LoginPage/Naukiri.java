package LoginPage;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Naukiri {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sakthi\\eclipse-workspace\\FaceBook Login\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.com");
		driver.manage().window().maximize();
		System.out.println("The driver URL" +  driver.getCurrentUrl());
		System.out.println("The driver Title" +  driver.getTitle());
		//WebElement findElement = driver.findElement(By.xpath("//h3[@class=\"sA5rQ\"]"));
		//findElement.click();
		
		//driver.navigate().refresh();
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.navigate().forward();
		//driver.findElement(By.xpath("//div[@class=\"fl ellip oBrLN\"]")).click();
		WebElement findEle1 = driver.findElement(By.xpath("(//span[@class=\"nav-icon nav-arrow\"])[1]"));
		Actions r = new Actions(driver);
		r.moveToElement(findEle1).perform();
		//WebElement findElement = driver.findElement(By.xpath("//span[@class=\"icp-radio]"));
		//r.moveToElement(findElement).perform();	
		//Robot r1 = new Robot();
		//for ( int i=0 ; i<5; i ++){
		//r1.keyPress(KeyEvent.VK_DOWN);
		//r1.keyRelease(KeyEvent.VK_DOWN);
		//}
		//WebElement findElement = driver.findElement(By.xpath("//span[text()=\"Português - PT\"]"));
		//findElement.click();
		//Select s = new Select(findEle1);
		//s.selectByVisibleText("Português - PT");
		driver.findElement(By.xpath("//input[@class=\"a-button-input\"]")).click();
		
		
		
		
		
	
	}

}
