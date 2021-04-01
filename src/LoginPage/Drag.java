package LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		System.out.println("The Title & URL of page" + driver.getTitle() + driver.getCurrentUrl());
		WebElement From = driver.findElement(By.xpath("(//a[@class=\"button button-orange\"])[5]"));
		WebElement To = driver.findElement(By.xpath("//li[@class=\"placeholder\"]"));
		Actions r = new Actions(driver);
		r.dragAndDrop(From, To).perform();
		WebElement findElement = driver.findElement(By.xpath("//div[@style=\"cursor: pointer; width: 16px; height: 16px; top: 0px; right: 0px; position: absolute; user-select: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0); pointer-events: auto; display: block; opacity: 1;\"]"));
		findElement.click();
	
		
	}
	
	

}
