package LoginPage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKartWindows {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.flipkart.com");
	driver.manage().window().fullscreen();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//button[@class=\"_2AkmmA _29YdH8\"]")).click();
	Thread.sleep(3000);
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Mobiles", Keys.ENTER);
    Thread.sleep(2000);
    List<WebElement> findElements = driver.findElements(By.xpath("//div[@class=\"_3wU53n\"]"));
    for (int i=0; i<5; i++ ) {
    	findElements.get(i).click();
    	
    }
    int count =0;
    Set<String> windowHandles = driver.getWindowHandles();
    int size = windowHandles.size();
    for (String Child:windowHandles) {
    	if (count == 3) {
    		driver.switchTo().window(Child);
    		System.out.println(size);
    		
    	}
    }
    
    Set<String> windowHandles2 = driver.getWindowHandles();
    ArrayList <String> List = new ArrayList<>();
     List.addAll(windowHandles2);
     for ( int i1=0 ; i1<5 ; i1++) {
    	 driver.switchTo().window(List.get(i1));
    	 System.out.println(driver.getTitle());
     }
	}
	
	}
	