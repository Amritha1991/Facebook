package LoginPage;

import java.awt.event.WindowStateListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartWindow2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class=\"_2AkmmA _29YdH8\"]")).click();
		driver.findElement(By.xpath("//input[@class=\"LM6RPg\"]")).sendKeys("Mobiles", Keys.ENTER);
		Thread.sleep(3000);
		List<WebElement> ments = driver.findElements(By.xpath("//div[@class=\"_3wU53n\"]"));
		for (int i=0; i<5; i++) {
			ments.get(i).click();
		}
		Set<String> handles = driver.getWindowHandles();
		ArrayList <String >list = new ArrayList<>();
		list.addAll(handles);
		for (int i=1 ; i<=5; i++) {
		 driver.switchTo().window(list.get(i));
		 String title = driver.getTitle();
		 System.out.println(title);
		 
		}		
		int count = 0;
	 Set<String> handles1 = driver.getWindowHandles();
	 System.out.println(handles1.size());
		for (String child:handles1) {
			 	if (count == 3) {
			 		driver.switchTo().window(child);
			 		Thread.sleep(3000);
			 		driver.findElement(By.xpath("//input[@class=\"_3X4tVa\"]")).click();
			 		String currentUrl = driver.getCurrentUrl();
			 		System.out.println(currentUrl);
			 		Thread.sleep(3000);
			 			}
				count++;
			
		}
		driver.switchTo().defaultContent();
	}

}
