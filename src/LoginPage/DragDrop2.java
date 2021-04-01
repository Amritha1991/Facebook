package LoginPage;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		WebElement from = driver.findElement(By.xpath("(//a[@class=\"button button-orange\"])[2]"));
		WebElement to = driver.findElement(By.xpath("(//li[@class=\"placeholder\"])[1]"));
		Actions r = new Actions(driver);
		Thread.sleep(3000);
		r.dragAndDrop(from, to).perform();
		
	   /* r.clickAndHold(driver.findElement(By.xpath("(//a[@class=\"button button-orange\"])[2]")));
	    Thread.sleep(2000);
		r.release(driver.findElement(By.xpath("(//li[@class=\"placeholder\"])[1]")));
		r.build();
		r.perform(); */

}

}
