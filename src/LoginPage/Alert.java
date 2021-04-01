package LoginPage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Alert {

	

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.location = 'http://demo.automationtesting.in/Alerts.html'");
		driver.manage().window().maximize();
		//Object executeScript = jse.executeScript("return document.Title;");
		//System.out.println(executeScript.toString());
		WebElement findElement = driver.findElement(By.xpath("//button[@class=\"btn btn-danger\"]"));
		findElement.click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//a[@href=\"#CancelTab\"]")).click();
		driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
		driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//a[@href=\"#Textbox\"]")).click();
		driver.findElement(By.xpath("//button[@class=\"btn btn-info\"]")).click();
		driver.switchTo().alert().accept();
		TakesScreenshot screen = (TakesScreenshot)driver;
		File src = screen.getScreenshotAs(OutputType.FILE);
		File dec = new File("C:\\Users\\sakthi\\eclipse-workspace\\FaceBook Login\\AlertScreen\\alert.png");
		Files.copy(src,dec);
		
		
		
		 
		
		
		
		
		
		
		
		

	}

	

}
