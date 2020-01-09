package screenShot.Selenium;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jayanthan\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
		driver.manage().window().maximize();
		List<WebElement> size = driver.findElements(By.tagName("frameset"));
		int framecount = size.size();
		System.out.println("The total frame count is"+framecount);
		driver.switchTo().frame("login_page");
		driver.findElement(By.xpath("(//img[@alt='continue'])[1]")).click();
		// driver.quit();
		Alert al=driver.switchTo().alert();
				al.accept();
				driver.quit();
	}

}
