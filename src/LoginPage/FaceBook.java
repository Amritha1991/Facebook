package LoginPage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {
	Select s;
	public static void main(String args[]) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sakthi\\eclipse-workspace\\FaceBook Login\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		System.out.println("The title of the page" + driver.getTitle() + driver.getCurrentUrl());
	Select s = new Select(driver.findElement(By.xpath("//select[@id=\"day\"]")));
	s.selectByIndex(7);
	Select s1 = new Select(driver.findElement(By.xpath("//select[@id=\"month\"]")));
	s1.selectByValue("12");
	Select s2 = new Select(driver.findElement(By.xpath("//select[@id=\"year\"]")));
	Thread.sleep(3000);
	s2.selectByVisibleText("1990");
	Select s3 = new Select(driver.findElement(By.xpath("//select[@id=\"day\"]")));
	List<WebElement> options = s3.getOptions();
	for (WebElement opt:options) {
		String text = opt.getText();
		System.out.println(text);
		
	}
	WebElement month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
	Select s4 = new Select(month);
	List<WebElement> options2 = s4.getAllSelectedOptions();
	for (WebElement mom:options2) {
		String attribute = mom.getAttribute("value");
		System.out.println(attribute);
		
		}
	
	}

}
