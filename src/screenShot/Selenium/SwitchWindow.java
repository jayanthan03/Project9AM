package screenShot.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindow {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jayanthan\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
				WebElement c = driver.findElement(By.xpath("//a[text()='CONTACT US']"));
		c.click();
		WebElement text = driver.findElement(By.xpath("(//div[@class='address-block address-border'])[1]"));
		String t = text.getText();
		System.out.println(t);
	}

}

