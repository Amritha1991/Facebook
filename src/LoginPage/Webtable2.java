package LoginPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
		driver.manage().window().maximize();	
		
		String beforexpath = "//*[@id=\"task-table\"]/tbody/tr[";
		String afterxpath = "]/td[2]";
		
		for (int i=1 ; i<7; i++) {
			String actualxpath = beforexpath+i+afterxpath;
			WebElement element = driver.findElement(By.xpath(actualxpath));
			String text = element.getText();
			System.out.println(text);
			if(element.getText().equals("Landing Page")) {
				System.out.println("The vlaue is available"+ element.getText()  +   "is found");
				break;
			}
			

			List<WebElement> findElements = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
			int size = findElements.size();
			System.out.println(size);
			
		}
		
		//*[@id="task-table"]/thead/tr/th[2]
		//*[@id="task-table"]/thead/tr/th[3]
		//*[@id="task-table"]/thead/tr/th[4]
		
		String beforexpath1 = "//*[@id=\"task-table\"]/thead/tr/th[";
		String afterxpath1 = "]";
		List<WebElement> elements = driver.findElements(By.xpath("//*[@id='task-table']/thead/tr/th"));
		int size = elements.size();
		System.out.println(size);
		

	}

}
	