package windows.Handling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greens {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jayanthan\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()=' DAY 2 TASK-(Locators -sendKeys)']")).click();
        Set<String> window = driver.getWindowHandles();	
        for(String x:window) {
        	driver.switchTo().window(x);
        }
        WebElement text = driver.findElement(By.xpath("//pre[@style='word-wrap: break-word; white-space: pre-wrap;']"));
        String text1 = text.getText();
        System.out.println(text1);
        driver.quit();
	}

}
