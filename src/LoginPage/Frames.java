package LoginPage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
public void fra() throws InterruptedException  {
	System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Frames.html");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	int totalframe = driver.findElements(By.tagName("iframe")).size();
	System.out.println("The total number of the frame is availabe in the page is"+ " "+ totalframe);
    //driver.switchTo().frame("src");
    driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("12345", Keys.ENTER);
    
}	

	public static void main(String[] args) throws InterruptedException {
		Frames F = new Frames ();
		F.fra();
		
		
		 
	}
	
}


