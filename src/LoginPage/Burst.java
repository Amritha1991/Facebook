package LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Burst {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin-stage.burstoralcare.com/orders");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class=\"form-control\"])[1]")).sendKeys("sakthivel.s@springrole.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class=\"form-control\"])[2]")).sendKeys("Sakthi@1990");
		driver.findElement(By.xpath("//button[@class=\"btn btn-primary btn-block\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class=\"pull-right btn btn-primary\"])[1]")).click();
		driver.findElement(By.xpath("(//input[@class=\"form-control\"])[1]")).sendKeys("payal", Keys.ENTER);
		for(int i=0; i<=75; i++) {
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,300)");
			Thread.sleep(4000);
		}
		
		
		
		
		

	}

}

