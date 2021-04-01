package LoginPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
		driver.manage().window().maximize();
		List<WebElement> ele = driver.findElements(By.tagName("tr"));
		for (WebElement row : ele) {
		Thread.sleep(3000);
		List<WebElement> findElements = row.findElements(By.xpath("th"));
	
			for (WebElement head:findElements) {
				String text = head.getText();
				System.out.println(text);
		}
		}
		
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		for (int j=2; j<3; j++)
		{
			rows.get(j).getText();
			Thread.sleep(3000);
List<WebElement> sel = rows.get(j).findElements(By.tagName("td"));
for (int i=0; i<4; i++) {

	String text = sel.get(i).getText();
	System.out.println(text);
}
	

}


	}

}

