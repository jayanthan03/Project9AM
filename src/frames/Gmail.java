package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jayanthan\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://greenstech.in/selenium-course-content.html");
	driver.manage().window().maximize();
	WebElement textbox = driver.findElement(By.xpath("//p[contains(text(),'demonstrated')]"));
	String text = textbox.getText();
	System.out.println(text);
	driver.close();
	}

}
