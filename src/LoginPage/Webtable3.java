package LoginPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable3 {

	public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("http://demo.guru99.com/test/table.html");
	 driver.manage().window().maximize();
	 	
	 String beforexpath = "/html/body/table/tbody/tr[5]/td[";
	 String afterxpath = "]";
	 
	 for (int i=1; i<=5 ; i++) {
		 String xpath = beforexpath+i+afterxpath;
			 WebElement findElement = driver.findElement(By.xpath(xpath));
			 System.out.println(findElement.getText());
			 
	 }
	 
	 List<WebElement> findElement2 = driver.findElements(By.xpath("/html/body/table/tbody/tr"));
	 int size1 = findElement2.size();
	 System.out.println(size1);	 
	 
	 List<WebElement> findElements = driver.findElements(By.xpath("/html/body/table/tbody/tr[1]/td"));
	 int size = findElements.size();
	 System.out.println(size);

	}
	
}




 // /html/body/table/tbody/tr[1]/td[1]
	//	/html/body/table/tbody/tr[1]/td[2]
 // /html/body/table/tbody/tr[5]/td
