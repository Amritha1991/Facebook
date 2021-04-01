package LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Homepage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sakthi\\eclipse-workspace\\FaceBook Login\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com//");
		
		String currentUrl = driver.getCurrentUrl();
		
		
		System.out.println(currentUrl);
		Thread.sleep(3000);
		WebElement srch = driver.findElement(By.id("email"));
		driver.findElement(By.id("pass")).sendKeys("123456");
		srch.sendKeys("Psycho - Unna Nenachu Video");
		//driver.findElement(By.id("u_0_b")).click();
		WebElement element = driver.findElement(By.xpath("//button[@class=\"_6j mvm _6wk _6wl _58mi _3ma _6o _6v\"]"));
		element.click();
		WebElement element2 = driver.findElement(By.xpath("//input [@class=\"inputtext _58mg _5dba _2ph- _5f0v\"]"));
		element2.sendKeys("Sakthivel");
		WebElement element3 = driver.findElement(By.xpath("//input [@class=\"inputtext _58mg _5dba _2ph-\"]"));
		element3.sendKeys("Ramesh");
		WebElement findElement = driver.findElement(By.xpath("(//input[@class=\"inputtext _58mg _5dba _2ph-\"])[3]"));
		findElement.sendKeys("9940354616");
		WebElement day = driver.findElement(By.id("day"));
		Select s= new Select(day);
		s.selectByVisibleText("7");
		WebElement month = driver.findElement(By.id("month"));
		Select r = new Select(month);
		r.selectByValue("12");
		WebElement year = driver.findElement(By.id("year"));
		Select d = new Select(year);
		d.selectByVisibleText("1990");
		driver.findElement(By.xpath("(//input[@class=\"_8esa\"])[2]")).click();
		WebElement fbcol = driver.findElement(By.xpath("//div[@class=\"clearfix loggedout_menubar\"]"));
		String col = fbcol.getCssValue("Color");
		System.out.println(col);
		WebElement element4 = driver.findElement(By.xpath("//button[@class=\"_6j mvm _6wk _6wl _58mi _3ma _6o _6v\"]"));
		String cssValue = element4.getCssValue("color");
		System.out.println(cssValue);
		
		
		
				
		
		
		
		
		
		
		
		
		

	}

}
