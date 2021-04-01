package LoginPage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Goibibo {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.goibibo.com/");
		driver.manage().window().fullscreen();
		System.out.println(driver.getCurrentUrl() + "  " +  driver.getTitle());
		driver.findElement(By.xpath("//span[@id=\"roundTrip\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"gosuggest_inputSrc\"]")).sendKeys("Chennai");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"gosuggest_inputDest\"]")).sendKeys("Hyderabad");
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class=\"DayPicker-NavButton DayPicker-NavButton--next\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id=\"fare_20200610\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class=\"DayPicker-NavButton DayPicker-NavButton--next\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("class=\"calDate\"")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class=\"fl plusSpin brdrTpBtmRt\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@class=\"custSelect width100 whiteBg padTB5 padLR10\"]")).click();
		Thread.sleep(2000);
		for (int i=1; i<2; i++) {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id=\"pax_close\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id=\"gi_search_btn\"]")).click();
		
		
		
		
		
		
		

	}

}
