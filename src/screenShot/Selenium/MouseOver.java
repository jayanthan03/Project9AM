package screenShot.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jayanthan\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.greenstechnologys.com/");
        driver.manage().window().maximize();
WebElement course = driver.findElement(By.xpath("//a[text()='COURSES']"));
Actions acc=new Actions(driver);
acc.moveToElement(course).perform();
WebElement oracle = driver.findElement(By.xpath("(//a[@href='http://www.greenstechnologys.com/oracle-training.html'])[1]"));
acc.moveToElement(oracle).perform();
driver.findElement(By.xpath("//span[text()='Performance Tuning Training']")).click();
driver.quit();
	}

}
