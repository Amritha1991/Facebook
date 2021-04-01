package LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {
	
	static WebDriver driver;
public void Java() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sakthi\\eclipse-workspace\\FaceBook Login\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.location = 'https://facebook.com'");
		
		driver.manage().window().maximize();
		WebElement findElement = driver.findElement(By.id("loginbutton"));
		jse.executeScript("arguments[0].style.border= '3px Solid red'", findElement);
		//jse.executeScript("arguments[0].click();", findElement);
		Object executeScript = jse.executeScript("return document.title;");
		Object executeScript2 = jse.executeScript("return document.URL;");
		System.out.println(executeScript.toString()+"  "+ executeScript2.toString());
		Object executeScript3 = jse.executeScript("return document.documentElement.innerText;");
		System.out.println(executeScript3.toString());
}
		
		
public static void main(String[] args) {
	JavaScript obj = new JavaScript();
	obj.Java();
}

}
