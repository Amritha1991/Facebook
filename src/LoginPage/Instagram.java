package LoginPage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class Instagram {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("Sakthivel403@gmail.com");
		driver.findElement(By.name("password")).sendKeys("9940181792");
		driver.findElement(By.xpath("//div[@class=\"                    Igw0E     IwRSH      eGOV_         _4EzTm    bkEs3                          CovQj                  jKUp7          DhRcB                                                    \"]")).click();
		//driver.findElement(By.xpath("//button[@class=\"aOOlW  bIiDR  \"]")).click();
		Thread.sleep(3000);
		Robot r = new Robot();
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		WebElement search = driver.findElement(By.xpath("//img[@src=\"https://instagram.fmaa6-1.fna.fbcdn.net/v/t51.2885-19/s150x150/94598446_845107422642760_8024148946551046144_n.jpg?_nc_ht=instagram.fmaa6-1.fna.fbcdn.net&_nc_ohc=_31ZKTiMW30AX9DyjyH&oh=4ece9cd0683f57c07619ac1b16d01c24&oe=5EEBD61E\"]"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();" , search);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class=\"-nal3 \"])[1]")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@title=\"happy_2b_alone\"]")).click();
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,300)");
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,-300)");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href=\"/happy_2b_alone/followers/\"]")).click();
		Thread.sleep(3000);
		TakesScreenshot a = (TakesScreenshot)driver;
		File src = a.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\sakthi\\eclipse-workspace\\FaceBook Login\\AlertScreen\\insta.png");
		Files.copy(src, des);
		Thread.sleep(3000);
		jse.executeScript("location.reload(0);");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[@class=\"TqC_a\"]")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@placeholder=\"Search\"]")).sendKeys("sakthisiva");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class=\"Ap253\"])[1]")).click();
		driver.findElement(By.xpath("//span[@class=\"TqC_a\"]")).click();
		driver.manage().timeouts().implicitlyWait (30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@placeholder=\"Search\"]")).sendKeys("Amrithapurusho");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[@class=\"Ap253\"]")).click();
		Thread.sleep(4000);
		Actions r1 = new Actions(driver);
		r1.contextClick(driver.findElement(By.xpath("//div[@class=\"q9xVd\"]"))).perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		for (int i=0; i<2 ; i++) {
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);	
			}
		driver.navigate().to("https://www.primevideo.com/storefront/home/ref=atv_nb_sf_hm");
		WebElement findElement2 = driver.findElement(By.id("pv-nav-sign-in"));
		findElement2.click();
		WebElement findElement = driver.findElement(By.id("ap_email"));
		findElement.sendKeys("Sakthivel403@gmail.com");
		driver.findElement(By.name("password")).sendKeys("9940354616");
		driver.findElement(By.id("signInSubmit")).click();
		WebElement findElement3 = driver.findElement(By.id("pv-search-nav"));
		findElement3.sendKeys("Thappad");
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//img[@alt=\"Thappad\"]")).click();
		driver.findElement(By.xpath("//span[@class=\"o0uko2 _356bMd\"]")).click();
		
		

		//r.keyPress(KeyEvent.VK_ENTER);
		//r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
	}
	
}